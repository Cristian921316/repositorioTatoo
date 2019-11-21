package tatoo.springboot.repositorio.controllers;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import tatoo.springboot.repositorio.auditoria.AuditoriaSave;
import tatoo.springboot.repositorio.entity.Marca;

import tatoo.springboot.repositorio.paginator.PageRender;
import tatoo.springboot.repositorio.service.ServiceMarcaDao;
import tatoo.springboot.view.xlsx.crearReporte;


@Controller
@SessionAttributes("marca")
public class MarcaController  {
	
	@Autowired	
	@Qualifier("ImplMarcaDao")
	private ServiceMarcaDao marcaDao;
	
	@Autowired	
	private AuditoriaSave auditoria;
	
		
	
	
	String valor_ant="",valor_nuevo="",valor_busqueda="",url="";
	Long total=0L;
	
   @RequestMapping(value="listarMarcas", method=RequestMethod.GET)
	public String ListarMarcas(@RequestParam(name="page", defaultValue="0") int page,Model model)
	{
	   
	   url="/listarMarcas";
	   
	   Pageable pageRequest = new PageRequest(page, 50);

		Page<Marca> marca = marcaDao.findAll(pageRequest);
		total = marcaDao.countAll();
		PageRender<Marca> pageRender = new PageRender<Marca>("/listarMarcas", marca);
		model.addAttribute("marcas",marca);
		model.addAttribute("titulo","Listado de Marcas");		
		model.addAttribute("totalRegistros",String.valueOf(total)+" Registros");		
		model.addAttribute("page", pageRender);
    	return "/listarMarcas";
    	
    	
		
	}
   @RequestMapping(value="/listarMarcas/{term}", method=RequestMethod.GET)
	public String ListarMarcasNombre(@PathVariable(value="term") String term,@RequestParam(name="page", defaultValue="0") int page,Model model)
	{   
	    url="/listarMarcas/"+term;
	   	valor_busqueda = term;
	   	Pageable pageRequest = new PageRequest(page, 50);
		Page<Marca> marca = marcaDao.findAllNombre(term,pageRequest);	
		total = marcaDao.countAllNombre(term);
		PageRender<Marca> pageRender = new PageRender<Marca>("/listarMarcas/"+term, marca);
		model.addAttribute("marcas",marca);
		model.addAttribute("titulo","Listado de Marcas");
		model.addAttribute("itemBusqueda",term);
		model.addAttribute("totalRegistros",String.valueOf(total)+" Registros");		
		model.addAttribute("page", pageRender);
		return "listarMarcas";   	
   	
		
	}
   
   @Secured({"ROLE_ADMIN"})
   @RequestMapping(value = "/formMarca")
	public String crearMarca( Model model) {
	   	Marca marca = new Marca();
	   	model.addAttribute("titulo", "Crear Marca");
	   	model.addAttribute("marcas", marca);
	   	//auditoria
	   	auditoria.setTabla("com_marca");
	   	auditoria.setAccion("Crear");
	   	
		return "/formMarca";
	} 
   
   
   @Secured({"ROLE_ADMIN"})
    @RequestMapping(value = "/formMarca/{id}")
    public String editar(@PathVariable(value="id") Long id,Model model,RedirectAttributes flash)
    {
    	
    	Marca marca = null;
    	if (id>0)
    	{
    		marca = marcaDao.findOne(id);
    		auditoria.setAnteriorMarca(marca);    	   
    		auditoria.setAccion("Editar");
    		if (marca == null)
    		{
    			
    			flash.addFlashAttribute("error", "Marca no encontrada");
    			return "redirect:/listarMarcas";
    		}
    	} 
    	
    			
    	model.addAttribute("titulo", "EditarMarca");
    	model.addAttribute("marcas", marca);		
		return "formMarca";
    }
    
   @Secured({"ROLE_ADMIN"})
    @RequestMapping(value = "/eliminaMarca/{id}")
    public String eliminar(@PathVariable(value="id") Long id,Model model,RedirectAttributes flash)
    {
    	
    	
    	if (id>0)
    	{
    		auditoria.setAccion("Eliminar");
    		Marca marca = marcaDao.findOne(id);
    		auditoria.setAnteriorMarca(marca);     		
    		marcaDao.delete(id);	    		
    		auditoria.SaveDetalleAuditoria("No","Ninguno");
			flash.addFlashAttribute("success", "Marca eliminada con exito!");   
			
    	} 
    	
    	return "redirect:"+url;
    }
    
   @Secured({"ROLE_ADMIN"})
    @RequestMapping(value = "/GuardarMarca",method = RequestMethod.POST)
	public String guardar(@Valid Marca marca, BindingResult result, Model model, RedirectAttributes flash, SessionStatus status) {
	   
	   
	  
	   
		if (result.hasErrors()) {			
			model.addAttribute("titulo", "Formulario de Marca");			
			return "formMarca";
		}
		String mensajeFlash ="";
		if(marca.getMarca_pk() != null) {			
			mensajeFlash = "Marca editada con éxito!";		
			
			}
		else {		
			
			mensajeFlash=	"Marca creada con éxito!";
			url="/listarMarcas";
		}
		
			   
		marcaDao.save(marca);		
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		auditoria.setValorNuevo(marca);  
		status.setComplete();
		auditoria.SaveDetalleAuditoria("No","Ninguno");
		return "redirect:"+url;
	}
   
   

}
