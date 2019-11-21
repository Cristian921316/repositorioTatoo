package tatoo.springboot.repositorio.controllers;



import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.datacontract.schemas._2004._07.REPOEntidadRepositorio.EProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.tempuri.IService1;
import org.tempuri.IService1Proxy;

import tatoo.springboot.repositorio.auditoria.AuditoriaSave;
import tatoo.springboot.repositorio.dao.RepDetAuditoriaDao;
import tatoo.springboot.repositorio.entity.Marca;
import tatoo.springboot.repositorio.entity.Producto;
import tatoo.springboot.repositorio.entity.RepDetAuditoria;
import tatoo.springboot.repositorio.paginator.PageRender;
import tatoo.springboot.repositorio.service.IUploadFileService;
import tatoo.springboot.repositorio.service.ServiceMarcaDao;
import tatoo.springboot.repositorio.service.ServiceProductoDao;
import tatoo.springboot.view.xlsx.crearReporte;






@Controller
@SessionAttributes("Producto")
public class ProductoController {

	
	@Autowired
	@Qualifier("ImplProductoDao")
	private ServiceProductoDao productoDao;
	@Autowired
	@Qualifier("ImplMarcaDao")
	private ServiceMarcaDao marcaDao;	
	
	@Autowired
	@Qualifier("UploadFileServiceImpl")
	private IUploadFileService uploadService;

	@Autowired
	private RepDetAuditoriaDao detAuditoriaDao;
	
	@Autowired	
	private AuditoriaSave auditoria;
	
	private crearReporte reporte = new crearReporte();
	
	private static final String EXTERNAL_FILE_PATH = "C:/repositorioWeb/archivosExportados/";
	
	Long marca_id,marca_creacion;
	String lstr_motivo;
	String lstr_valor_motivo,lstr_url_retorno,lstr_msj_excel,lstr_tipo_motivo;
	
	String valor_ant="",valor_nuevo="";
	
	List<Marca> marcas =  new ArrayList<>();
	List<Producto> listProductos = null; //lista de productos excel
	List<Producto> listProductosAnt = null;
	Page<Producto> producto;
	
	String list_marca="";
	String lstr_text_motivo="";
	Long total=0L;
	boolean lb_crea=false;
	
	@Value("${servicio_web_ecuador}")
	private String servicio_ecuador;	
	@Value("${servicio_web_colombia}")
	private String servicio_colombia;
	@Value("${servicio_web_chile}")
	private String servicio_chile;
	@Value("${servicio_web_peru}")
	private String servicio_peru;
	
	
	private String excLecturaArchivo;
	
	
	//lista de la auditoria
	
	
	@GetMapping(value = "buscarMarca/{term}")
	public String  cargarProductosPorMarca(@PathVariable(value="term") Long term,@RequestParam(name="page", defaultValue="0") int page,Model model) {
		marca_id = term;		
		lstr_motivo="buscarMarca/";
		Pageable pageRequest = new PageRequest(page, 50);
		producto = productoDao.findAllby(term,pageRequest);	
		total = productoDao.countByMarca(term);
		listProductos = productoDao.findProducMarca(term);
		list_marca = marcaDao.findOne(term).getNombre();
		PageRender<Producto> pageRender = new PageRender<Producto>("/buscarMarca/"+term, producto);
		model.addAttribute("productos",producto);
		model.addAttribute("titulo","Listado de Productos");
		model.addAttribute("itemBusqueda", "Nombre");
		model.addAttribute("marcaId", marca_id);
		model.addAttribute("itemMarca",list_marca);		
		model.addAttribute("ParamBusqueda",String.valueOf(total)+" Registros");
		model.addAttribute("page", pageRender);
		model.addAttribute("marcas", marcas);			
    	return "/listarProductos";
		
	}
	
	@GetMapping(value = "buscarNombre/{term}")
	public String  cargarProductosPorNombre(@PathVariable(value="term") String term,@RequestParam(name="page", defaultValue="0") int page,Model model) {
		lstr_motivo="buscarNombre/";
		lstr_valor_motivo = term;	
		lstr_tipo_motivo = "Nombre";
		Pageable pageRequest = new PageRequest(page, 50);
		producto = productoDao.findAllbyNombre(term,marca_id,pageRequest);	
		listProductos = productoDao.findAllbyNombre(term,marca_id);
		PageRender<Producto> pageRender = new PageRender<Producto>("/buscarNombre/"+term, producto);
		total = productoDao.countByMarcaNombre(term,marca_id);
		model.addAttribute("productos",producto);
		model.addAttribute("itemMarca",list_marca);
		model.addAttribute("valorMotivo",lstr_valor_motivo);
		model.addAttribute("marcaId", marca_id);
		model.addAttribute("itemBusqueda", "Nombre");
		model.addAttribute("ParamBusqueda",String.valueOf(total)+" Registros");
		model.addAttribute("titulo","Listado de Productos");
		model.addAttribute("page", pageRender);		
		model.addAttribute("marcas", marcas);
    	return "/listarProductos";
		
	}
	
	
	
	@GetMapping(value = "buscarStyle/{term}")
	public String  cargarProductosPorStyle(@PathVariable(value="term") String term,@RequestParam(name="page", defaultValue="0") int page,Model model) {
		lstr_motivo="buscarStyle/";
		lstr_valor_motivo = term;
		lstr_tipo_motivo = "Style";
		Pageable pageRequest = new PageRequest(page, 50);
		producto = productoDao.findAllbyStyle(term,marca_id,pageRequest);
		listProductos = productoDao.findAllbyStyle(term,marca_id);
		PageRender<Producto> pageRender = new PageRender<Producto>("/buscarStyle/"+term, producto);
		total = productoDao.countByMarcaStyle(term,marca_id);
		model.addAttribute("productos",producto);
		model.addAttribute("itemMarca",list_marca);
		model.addAttribute("valorMotivo",lstr_valor_motivo);
		model.addAttribute("marcaId", marca_id);
		model.addAttribute("itemBusqueda", "Style Number");
		model.addAttribute("titulo","Listado de Productos");
		model.addAttribute("ParamBusqueda",String.valueOf(total)+" Registros");
		model.addAttribute("page", pageRender);		
		model.addAttribute("marcas", marcas);
    	return "/listarProductos";
		
	}
	
	@GetMapping(value = "buscarUpc/{term}")
	public String  cargarProductosPorUpc(@PathVariable(value="term") String term,@RequestParam(name="page", defaultValue="0") int page,Model model) {
		lstr_motivo="buscarUpc/";
		lstr_valor_motivo = term;
		lstr_tipo_motivo = "Upc";
		Pageable pageRequest = new PageRequest(page, 50);
		producto = productoDao.findAllbyUpc(term,marca_id,pageRequest);	
		listProductos = productoDao.findAllbyUpc(term,marca_id);
		PageRender<Producto> pageRender = new PageRender<Producto>("/buscarUpc/"+term, producto);
		total = productoDao.countByMarcaUpc(term,marca_id);
		model.addAttribute("productos",producto);
		model.addAttribute("titulo","Listado de Productos");
		model.addAttribute("valorMotivo",lstr_valor_motivo);
		model.addAttribute("marcaId", marca_id);
		model.addAttribute("itemBusqueda", "Upc");
		model.addAttribute("itemMarca",list_marca);
		model.addAttribute("ParamBusqueda",String.valueOf(total)+" Registros");
		model.addAttribute("page", pageRender);		
		model.addAttribute("marcas", marcas);
    	return "/listarProductos";
		
	}
	
	@GetMapping(value = "buscarAllUpc/{term}")
	public String  cargarProductosAllUpc(@PathVariable(value="term") String term,@RequestParam(name="page", defaultValue="0") int page,Model model) {
		lstr_motivo="buscarAllUpc/";
		lstr_valor_motivo = term;
		lstr_tipo_motivo = "Upc";
		Pageable pageRequest = new PageRequest(page, 50);
		producto = productoDao.findAllUpc(term,pageRequest);	
		listProductos = productoDao.findAllUpc(term);
		PageRender<Producto> pageRender = new PageRender<Producto>("/buscarAllUpc/"+term, producto);
		total = productoDao.countAllUpc(term);
		model.addAttribute("productos",producto);
		model.addAttribute("titulo","Listado de Productos");
		model.addAttribute("valorMotivo",lstr_valor_motivo);
		model.addAttribute("marcaId", marca_id);
		model.addAttribute("itemBusqueda", "Upc");
		model.addAttribute("itemMarca",list_marca);
		model.addAttribute("ParamBusqueda",String.valueOf(total)+" Registros");
		model.addAttribute("page", pageRender);		
		model.addAttribute("marcas", marcas);
    	return "/listarProductos";
		
	}
	@GetMapping(value = "buscarAllStyle/{term}")
	public String  cargarProductosAllStyle(@PathVariable(value="term") String term,@RequestParam(name="page", defaultValue="0") int page,Model model) {
		lstr_motivo="buscarAllStyle/";
		lstr_tipo_motivo = "Style";
		lstr_valor_motivo = term;
		lstr_tipo_motivo = "Style";
		Pageable pageRequest = new PageRequest(page, 50);
		producto = productoDao.findAllStyle(term,pageRequest);	
		listProductos = productoDao.findAllStyle(term);
		PageRender<Producto> pageRender = new PageRender<Producto>("/buscarAllStyle/"+term, producto);
		total = productoDao.countAllStyle(term);
		model.addAttribute("productos",producto);
		model.addAttribute("titulo","Listado de Productos");
		model.addAttribute("valorMotivo",lstr_valor_motivo);
		model.addAttribute("marcaId", marca_id);
		model.addAttribute("itemBusqueda", "Style");
		model.addAttribute("itemMarca",list_marca);
		model.addAttribute("ParamBusqueda",String.valueOf(total)+" Registros");
		model.addAttribute("page", pageRender);		
		model.addAttribute("marcas", marcas);
    	return "/listarProductos";
		
	
	}
	
	@GetMapping(value = "buscarAllNombre/{term}")
	public String  cargarProductosAllNombre(@PathVariable(value="term") String term,@RequestParam(name="page", defaultValue="0") int page,Model model) {
		lstr_motivo="buscarAllNombre/";
		lstr_valor_motivo = term;
		lstr_tipo_motivo = "Nombre";		
		Pageable pageRequest = new PageRequest(page, 50);
		producto = productoDao.findAllNombre(term,pageRequest);	
		listProductos = productoDao.findAllNombre(term);
		PageRender<Producto> pageRender = new PageRender<Producto>("/buscarAllNombre/"+term, producto);
		total = productoDao.countAllNombre(term);
		model.addAttribute("productos",producto);
		model.addAttribute("titulo","Listado de Productos");
		model.addAttribute("valorMotivo",lstr_valor_motivo);
		model.addAttribute("marcaId", marca_id);
		model.addAttribute("itemBusqueda", "Nombre");
		model.addAttribute("itemMarca",list_marca);
		model.addAttribute("ParamBusqueda",String.valueOf(total)+" Registros");
		model.addAttribute("page", pageRender);		
		model.addAttribute("marcas", marcas);
    	return "/listarProductos";
		
	
	}
	
	
	
	@RequestMapping(value = {"/gestionProductos"})
	public String listarProductos(Model model)
	{
		list_marca = "Escoger Marca";
		marca_id = 0L;
		marcas = marcaDao.findAllOrdenado();
		model.addAttribute("marcas", marcas);
		model.addAttribute("itemMarca",list_marca);
		model.addAttribute("itemBusqueda", "Buscar por");
		model.addAttribute("marcaId", marca_id);
		model.addAttribute("titulo","Gestion de Productos");
		return "/gestionProductos";
	}
	
	@RequestMapping(value = "/formProducto")
	public String crearProducto(Model model)	{
		lstr_motivo="buscarMarca/";
		marcas = marcaDao.findAllOrdenado();
		Producto producto = new Producto();		
		model.addAttribute("titulo", "Crear Producto");
	   	model.addAttribute("productos", producto);
	   	model.addAttribute("marcas", marcas);
	   	auditoria.setTabla("com_producto");
	   	auditoria.setAccion("Crear");
	   	auditoria.lstr_ant="";
	   	lb_crea=true;
		return "/formProducto";
	}
	
	
	@RequestMapping(value = "/editProducto/{id}")
	public String editar(@PathVariable(value="id") Long id,Model model,RedirectAttributes flash)	{
		
		Marca marcas = null;	
		Producto producto = productoDao.findOne(id);		
		model.addAttribute("titulo", "Editar Producto");
	   	model.addAttribute("productos", producto);
	   	model.addAttribute("marcas", marcas);
	   	auditoria.setTabla("com_producto");
	   	auditoria.setAccion("Editar");
	   	auditoria.setValorProducto(producto,"anterior");
		return "/editProducto";
	}
	
	@RequestMapping(value = "/eliminarProducto/{id}")
	public String eliminar(@PathVariable(value="id") Long id,Model model,RedirectAttributes flash,HttpServletRequest request)
	{
		List<RepDetAuditoria> listAuditoria= new ArrayList<RepDetAuditoria>();
		if (id>0)
    	{
			
    		Producto producto = productoDao.findOne(id);
    		auditoria.setTabla("com_producto");
		   	auditoria.setAccion("Eliminar");
		   	auditoria.setValorProducto(producto,"anterior"); 		   	 	
    		productoDao.delete(id);
    		listAuditoria.add(auditoria.AddDetalleAuditoria("No","Ninguno",request));
			detAuditoriaDao.save(listAuditoria);	  
			flash.addFlashAttribute("success", "Producto eliminado con exito!");
    		
    	} 
		lstr_url_retorno = lstr_motivo+lstr_valor_motivo;
		if (lstr_motivo.equals("buscarMarca/"))
		{
			return "redirect:/buscarMarca/"+marca_id ;
		}
		return "redirect:/"+lstr_url_retorno;
	}
	
	@RequestMapping(value="/GuardarProducto", method=RequestMethod.POST)
	public String guardar(@Valid Producto producto, BindingResult result, Model model, RedirectAttributes flash, SessionStatus status,HttpServletRequest request)
	{
		List<RepDetAuditoria> listAuditoria= new ArrayList<RepDetAuditoria>();
		if (result.hasErrors()) {			
			model.addAttribute("titulo", "Formulario de Producto");			
			return "formProducto";
		}
		
		String mensajeFlash ="";
		if(producto.getPk_producto() != null) {
			mensajeFlash = "Producto editado con éxito!";			   
				
			
			}else {
			mensajeFlash=	"Producto creado con éxito!";
			
			
			
			}
		if (producto.getOem()==null)producto.setOem(0L);
		if (producto.getTipo()==null)producto.setTipo(0L);
		
		productoDao.save(producto);
		auditoria.setValorProducto(producto,"nuevo");
		listAuditoria.add(auditoria.AddDetalleAuditoria("No","Ninguno",request));
		detAuditoriaDao.save(listAuditoria);
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		lstr_url_retorno = lstr_motivo+lstr_valor_motivo;
		if (lstr_motivo.equals("buscarMarca/") || lstr_url_retorno ==null || lb_crea)
		{
			marca_creacion = producto.getMarca_pk().getMarca_pk();
			lb_crea=false;
			return "redirect:/buscarMarca/"+marca_creacion ;
		}
		return "redirect:/"+lstr_url_retorno;
		
	}
	
	@RequestMapping(value="/subirExcel", method=RequestMethod.POST)
	public String subirExcel(@RequestParam("file") MultipartFile archivoExcel,Model model,RedirectAttributes flash,HttpServletRequest request) throws IOException
	{
		String archivo_server= uploadService.copy(archivoExcel);
		String sube=request.getParameter("checkPaises");
		List<RepDetAuditoria> listAuditoria= new ArrayList<RepDetAuditoria>();
		
		try (FileInputStream excelStream = new FileInputStream(new File("C:/repositorioWeb/archivosImportados/"+archivo_server))){
			System.out.println("Se ha guardado con exito");
			Marca marca = marcaDao.findOne(marca_id);
			List<Producto> productos = new ArrayList<Producto>();
			productos=	upExcel(excelStream,marca,archivo_server,listAuditoria,request);
			if (!productos.isEmpty() || productos.size()>0)
			{
				try
				{
					productoDao.saveAll(productos);
					detAuditoriaDao.save(listAuditoria);
					lstr_msj_excel = "Se ha subido y actualizado correctamente ";
					if(excLecturaArchivo!=null)lstr_msj_excel = "Se ha subido y actualizado correctamente, "+excLecturaArchivo;					
					flash.addFlashAttribute("success", lstr_msj_excel);	
				}catch(Exception ex)
				{
					ex.printStackTrace();
					lstr_msj_excel="Errores: 1-Pueden existir valores de UPC repetidos en el archivo"
							+ " 2-Talves no esta seleccionada la marca a subir, revisar estos puntos y volver a subir";
					flash.addFlashAttribute("error", lstr_msj_excel);	
				}
				if(sube!=null)
				{
					System.out.println("correcto");
					actualizarPais(productos);
				}	
				
				
				
			}else
			{
				//model.addAttribute("marcas", marcas);	
				//.addAttribute("titulo", "Subida de Informacion");	
				lstr_msj_excel = "Errores:1-El archivo no cumple con la estructura,2-Esta vacio o 3-No se esta cargando en la marca correcta!";
				flash.addFlashAttribute("error", lstr_msj_excel);	
				
			}
			
		}catch (Exception e) {
			lstr_msj_excel = "Errores:1-El archivo no cumple con la estructura,2-Esta vacio o 3-No se esta cargando en la marca correcta!";
			e.printStackTrace();
			flash.addFlashAttribute("error", lstr_msj_excel);	
		}			
		lstr_url_retorno = lstr_motivo+lstr_valor_motivo;
		if (lstr_motivo.equals("buscarMarca/"))		{
			
			return "redirect:/buscarMarca/"+marca_id ;
		}			
		
		lstr_url_retorno = lstr_motivo+lstr_valor_motivo;
		model.addAttribute("marcas", marcas);	
		model.addAttribute("titulo", "Subida de Informacion");			
		return "redirect:/"+lstr_url_retorno;		
	}
	
	
	
	@RequestMapping("/downloadProductos/{fileName:.+}")
	public void descargar(HttpServletRequest request, HttpServletResponse response,
			@PathVariable("fileName") String fileName) throws IOException 
	{
	
		reporte.crearProductos("listarProductos",listProductos);
		File file = new File(EXTERNAL_FILE_PATH + fileName);
		if (file.exists()) {

			//get the mimetype
			String mimeType = URLConnection.guessContentTypeFromName(file.getName());
			if (mimeType == null) {
				//unknown mimetype so set the mimetype to application/octet-stream
				mimeType = "application/octet-stream";
			}

			response.setContentType(mimeType);
			
			response.setHeader("Content-Disposition", String.format("inline; filename=\"" + file.getName() + "\""));

			 //Here we have mentioned it to show as attachment
			// response.setHeader("Content-Disposition", String.format("attachment; filename=\"" + file.getName() + "\""));

			response.setContentLength((int) file.length());

			InputStream inputStream = new BufferedInputStream(new FileInputStream(file));

			FileCopyUtils.copy(inputStream, response.getOutputStream());
		
		}
		listProductos= null;
	}
	
	
	public List<Producto> upExcel(FileInputStream file,Marca marca,String archivoExcel,List<RepDetAuditoria> listAuditoria,HttpServletRequest request)
	{	
		int filas=0,li_crear=0;
		String lstr_columna="",lstr_valor_cell="",lstr_upc="";
		Long ll_tipo=0L,ll_oem=0L;
		
		List<Producto> productos = new ArrayList<Producto>();		
		Map<Integer, String> nomColumnas = new HashMap<>();
		try {
			
			@SuppressWarnings("resource")
			XSSFWorkbook worbook = new XSSFWorkbook(file);
			//obtener la hoja que se va leer
			XSSFSheet sheet = worbook.getSheetAt(0);
			
			System.out.println(sheet.getPhysicalNumberOfRows());
			filas = sheet.getPhysicalNumberOfRows();
			
			for(int f=0;f<filas;f++)
			{
				
				//si es la primera fila(cabecera del formato) se cuentan el numero de columnas
				if (f==0) {
					//se coloca las columnas en un mapa para poder con ellos validar el contenido					
					nomColumnas.put(0,sheet.getRow(f).getCell(0).getStringCellValue());
					nomColumnas.put(1,sheet.getRow(f).getCell(1).getStringCellValue());
					nomColumnas.put(2,sheet.getRow(f).getCell(2).getStringCellValue());
					nomColumnas.put(3,sheet.getRow(f).getCell(3).getStringCellValue());
					nomColumnas.put(4,sheet.getRow(f).getCell(4).getStringCellValue());
					nomColumnas.put(5,sheet.getRow(f).getCell(5).getStringCellValue());
					nomColumnas.put(6,sheet.getRow(f).getCell(6).getStringCellValue());
					
				}else
				{
					int cols = sheet.getRow(f).getPhysicalNumberOfCells();
					//se busca el producto
					lstr_upc = lstr_valor_cell=sheet.getRow(f).getCell(1).getStringCellValue();					
					//si n existe el producto se genera uno nuevo
					Producto produc = null;
					produc = productoDao.findOneUpc(lstr_upc);	
					
					if(produc == null) 
					{
						produc = new Producto();
						auditoria.setTabla("com_producto");
						auditoria.setAccion("Crear");
						
					}
					else //si lo ha encontrado se guarda en la auditoria el valor anterior
					{
						//si no es la misma marca retorna
						if(produc.getMarca_pk().getMarca_pk()!=marca.getMarca_pk()) return productos;
						auditoria.setTabla("com_producto");
						auditoria.setAccion("Editar");
						auditoria.setValorProducto(produc,"anterior");
						
					}
					
					if (produc!=null)
					{
					
					for(int c=0;c<7;c++)
					{
						lstr_columna = nomColumnas.get(c);							
						try {
							lstr_valor_cell=sheet.getRow(f).getCell(c).getStringCellValue();
											
						}catch (Exception e) {
							e.printStackTrace();							
							lstr_valor_cell=null;
							excLecturaArchivo="Advertencias: 1-Existe informacion en el archivo que no estaria guardada como texto"
									+ "2-Existen columnas en blanco,por estos motivos revisar la informacion subida en el sistema";
						}
						switch (lstr_columna) {
						case "style_number":
							produc.setStyle_number(lstr_valor_cell);
							break;
						case "upc":	
							produc.setUpc(lstr_valor_cell);
							lstr_upc = lstr_valor_cell;
							break;
						case "nombre":								
							produc.setNombre(lstr_valor_cell.trim());
							break;
						case "talla":							
							produc.setTalla(lstr_valor_cell);
							break;
						case "color":
							produc.setColor(lstr_valor_cell);
							break;
						case "tipo":
							if (lstr_valor_cell ==null)
							{
								produc.setTipo(0L);
							}else
							{
								produc.setTipo(Long.parseLong(lstr_valor_cell,10));
							}
							break;	
						case "oem":
							if (lstr_valor_cell ==null)
							{
								produc.setOem(0L);
							}else
							{
								produc.setOem(Long.parseLong(lstr_valor_cell,10));
							}
							break;	
						default :
							break;	
					}
				}
								
				produc.setMarca_pk(marca);				
				productos.add(produc);
				}
				//se guarda el valor nuevo
				auditoria.setValorProducto(produc,"nuevo");	
				listAuditoria.add(auditoria.AddDetalleAuditoria("Si",archivoExcel,request));
				
			}
				
		}
			
		}catch(IOException e)
		{
			e.printStackTrace();
			
		}
		return productos;
	}		
	
	public void actualizarPais(List<Producto> productos)
	{
		
		IService1Proxy act=null;
		String pais="";		
		for (Producto pro:productos)
		{
			EProducto upc = new EProducto();
			upc.setColor(pro.getColor());			
			upc.setNombre(pro.getNombre());
			upc.setUpc(pro.getUpc());
			upc.setOem(false);
			if (pro.getOem()==1)upc.setOem(true);						
			upc.setStyle_number(pro.getStyle_number());
			upc.setTalla(pro.getTalla());
			
			//Actualizacion paises
			for(int i=0;i<4;i++)
			{			
			
				switch (i) {
					case 0://ecuador						
						pais="Ecuador";
						act = new IService1Proxy();
						act.setUrlServicio(this.getServicio_ecuador());
					break;
					case 1://chile
						pais="Colombia";
						act = new IService1Proxy(this.getServicio_colombia());
						act.setUrlServicio(servicio_colombia);
						break;
					case 2://peru
						pais="Peru";
						act = new IService1Proxy(this.getServicio_peru());
						act.setUrlServicio(servicio_peru);
						break;
					case 3://colombia
						pais="Chile";
						act = new IService1Proxy(this.getServicio_chile());
						act.setUrlServicio(servicio_chile);
						break;
				}
				try {
					 int Resul=	act.updateInfoUpc(upc);
					 System.out.println("Resultado: "+pais+":"+Resul);	
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						
					}
			
			}
			
		}
		
	}

	public String getServicio_ecuador() {
		return servicio_ecuador;
	}

	public void setServicio_ecuador(String servicio_ecuador) {
		this.servicio_ecuador = servicio_ecuador;
	}

	public String getServicio_colombia() {
		return servicio_colombia;
	}

	public void setServicio_colombia(String servicio_colombia) {
		this.servicio_colombia = servicio_colombia;
	}

	public String getServicio_chile() {
		return servicio_chile;
	}

	public void setServicio_chile(String servicio_chile) {
		this.servicio_chile = servicio_chile;
	}

	public String getServicio_peru() {
		return servicio_peru;
	}

	public void setServicio_peru(String servicio_peru) {
		this.servicio_peru = servicio_peru;
	}
	
}
