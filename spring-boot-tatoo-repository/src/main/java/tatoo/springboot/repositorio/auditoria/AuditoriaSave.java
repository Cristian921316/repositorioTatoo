package tatoo.springboot.repositorio.auditoria;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import tatoo.springboot.repositorio.auth.handler.LoginSuccessHandler;
import tatoo.springboot.repositorio.dao.IUsuarioDao;
import tatoo.springboot.repositorio.dao.RepDetAuditoriaDao;
import tatoo.springboot.repositorio.entity.Marca;
import tatoo.springboot.repositorio.entity.Producto;
import tatoo.springboot.repositorio.entity.RepDetAuditoria;
import tatoo.springboot.repositorio.entity.Usuario;

@Component 
public class AuditoriaSave {
	
	
	
	@Autowired
	private RepDetAuditoriaDao detAuditoriaDao;
	
	private RepDetAuditoria repDetAuditoria;
	
	private Marca marca;
	
	private Producto producto;
	
	@Autowired
	private LoginSuccessHandler login;
	
	private String tabla;
	
	private String accion;
	
	private Authentication usuario;
	
	@Autowired
	private IUsuarioDao users;
	
	public String lstr_ant="",lstr_nuevo="";
	
	
	public void setAnteriorMarca(Marca marca)
	{
		lstr_ant = "Id:"+marca.getMarca_pk()+",Nombre:"+marca.getNombre()
					+",FkWeb:"+marca.getFk_web()+",FkEcuador:"+marca.getFk_tatoosoft_ecu()
					+",FkChile:"+marca.getFk_tatoosoft_chl()+",FkColombia:"+marca.getFk_tatoosoft_col()
					+",FkPeru:"+marca.getFk_tatoosoft_per();
	}
	
	public void setValorNuevo(Marca marca)
	{
		lstr_nuevo = "Id:"+marca.getMarca_pk()+",Nombre:"+marca.getNombre()
					+",FkWeb:"+marca.getFk_web()+",FkEcuador:"+marca.getFk_tatoosoft_ecu()
					+",FkChile:"+marca.getFk_tatoosoft_chl()+",FkColombia:"+marca.getFk_tatoosoft_col()
					+",FkPeru:"+marca.getFk_tatoosoft_per();
	}
	
	public void setValorProducto(Producto producto,String tipo)
	{
		if (tipo.equals("anterior"))
		{
		
			lstr_ant = "Id:"+producto.getPk_producto()+",Nombre:"+producto.getNombre()
				  +",Upc:"+producto.getUpc()+",Marca:"+producto.getMarca_pk().getNombre()
				  + ",Color:"+producto.getColor()+",Talla:"+producto.getTalla()				  
				  +",Style:"+producto.getStyle_number()+",Oem:"+producto.getOem()+",Tipo:"+producto.getTipo();
				  
		}else
		{
			lstr_nuevo = "Id:"+producto.getPk_producto()+",Nombre:"+producto.getNombre()
			  +",Upc:"+producto.getUpc()+",Marca:"+producto.getMarca_pk().getNombre()
			  + ",Color:"+producto.getColor()+",Talla:"+producto.getTalla()				  
			  +",Style:"+producto.getStyle_number()+",Oem:"+producto.getOem()+",Tipo:"+producto.getTipo();
			
		}
		
	}
	
	
	
	public RepDetAuditoria AddDetalleAuditoria(String subeArchivo,String NombreArchivo,HttpServletRequest request)
	{
		Usuario user = users.findByUsername(request.getRemoteUser());
		repDetAuditoria = new RepDetAuditoria();
		repDetAuditoria.setAccion_cambio(accion);
		repDetAuditoria.setUser_id(user);
		repDetAuditoria.setFecha_cambio(new Date());
		repDetAuditoria.setNom_archivo(NombreArchivo);
		repDetAuditoria.setSube_archivo(subeArchivo);
		repDetAuditoria.setTabla_cambio(tabla);
		repDetAuditoria.setValor_ant(lstr_ant);
		repDetAuditoria.setValor_nuevo(lstr_nuevo);		
		lstr_ant="";
		lstr_nuevo="";
		return repDetAuditoria;
	}
	
	public void SaveDetalleAuditoria(String subeArchivo,String NombreArchivo)
	{
		detAuditoriaDao.save(repDetAuditoria);
		lstr_ant="";
		lstr_nuevo="";
		
	}

	public String getTabla() {
		return tabla;
	}

	public void setTabla(String tabla) {
		this.tabla = tabla;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}
	
	

}
