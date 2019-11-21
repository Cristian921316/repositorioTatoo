package tatoo.springboot.repositorio.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import tatoo.springboot.repositorio.dao.IUsuarioDao;
import tatoo.springboot.repositorio.entity.Role;
import tatoo.springboot.repositorio.entity.Usuario;

@Controller
@SessionAttributes("usuario")
public class UsuarioController {
	
	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Autowired
	private  BCryptPasswordEncoder passwordEncoder;
	
	
	
	private List<Role> roles;
	
	String lstr_mensaje="",url="",clave_actual="",nueva_clave="",confirm_clave="";
	
	@RequestMapping(value="formUsuario", method=RequestMethod.GET)
	public String crearUsuario(Model model)
	{
		url="/formUsuario";
		Usuario usuario = new Usuario();
		model.addAttribute("titulo","Permisos");
		model.addAttribute("usuario",usuario);
		return "/formUsuario";
	}
	
	
	@RequestMapping(value="/editarPermisos", method=RequestMethod.POST)
	public String editarPermisos(Model model,Authentication authentication,HttpServletRequest request)
	{
		Usuario usuario = new Usuario();
		usuario = usuarioDao.findByUsername(request.getParameter("txtBuscarUsername"));		
		model.addAttribute("titulo","Edicion Usuario");
		model.addAttribute("usuario",usuario);
		return "/formUsuario";
	}
	
	@RequestMapping(value="formCuenta", method=RequestMethod.GET)
	public String editarUsuario(Model model,Authentication authentication)
	{
		url="/formCuenta";
		Usuario usuario = new Usuario();
		usuario = usuarioDao.findByUsername(authentication.getName());		
		model.addAttribute("titulo","Edicion Usuario");
		model.addAttribute("usuario",usuario);
		return "/formCuenta";
	}
	
	@RequestMapping(value="/CambioClave", method=RequestMethod.POST)
	public String cambioClave(Model model,Authentication authentication,HttpServletRequest request,RedirectAttributes flash,SessionStatus status)
	{
		Usuario usuario = null;
		clave_actual = request.getParameter("txtClaveActual");
		nueva_clave = request.getParameter("txtClaveNueva");
		confirm_clave=request.getParameter("txtClaveConfirma");		
//		String bcryptPassword = passwordEncoder.encode(clave_actual);
		
		usuario = usuarioDao.findByUsername(authentication.getName());		
		if(usuario!=null &&nueva_clave.equals(confirm_clave))
		{
			String password_nueva = passwordEncoder.encode(nueva_clave);
			usuario.setPassword(password_nueva);
			usuario.setDesc_clave(nueva_clave);
			usuarioDao.save(usuario);	
			status.setComplete();
			lstr_mensaje="Cambio Exitoso!";
			flash.addFlashAttribute("success", lstr_mensaje);
		}else
		{
			lstr_mensaje="Las claves no coinciden, porfavor vuelva a intentarlo!";
			flash.addFlashAttribute("error", lstr_mensaje);
		}
		
		return "redirect:/formCuenta";
	}
	
	@RequestMapping(value="/GuardarUsuario", method=RequestMethod.POST)
	public String guardarUsuario(@Valid Usuario usuario,Model model,RedirectAttributes flash, SessionStatus status,HttpServletRequest request)
	{
		
		if(usuario.getId()!=null)
		{	
			roles = usuario.getRoles();
			roles.get(0).setAuthority(request.getParameter("txtRol"));
			usuario.setRoles(roles);
			lstr_mensaje = "Se ha editado Usuario con exito!";
			
		}else
		{
			Role role = new Role();
			role.setAuthority(request.getParameter("txtRol"));
			usuario.addRole(role);
			
			lstr_mensaje = "Se ha creado Usuario con exito!";
			
		}
		
		//se encripta la clave		
		String bcryptPassword = passwordEncoder.encode(usuario.getPassword());
		usuario.setDesc_clave(usuario.getPassword());
		usuario.setPassword(bcryptPassword);
		usuario.setEmail(usuario.getUsername());
		usuario.setEnabled(true);
		usuarioDao.save(usuario);		
		status.setComplete();
		model.addAttribute("titulo","Permisos");
		flash.addFlashAttribute("success", lstr_mensaje);		
		return "redirect:"+url;
	}
	
	@RequestMapping(value="/GuardarCuenta", method=RequestMethod.POST)
	public String guardarCuenta(Model model,RedirectAttributes flash, SessionStatus status,HttpServletRequest request)
	{
		//se busca el usuario y se edita solo dos parametros
		Usuario user = usuarioDao.findByUsername(request.getRemoteUser());
		user.setNombre(request.getParameter("nombre"));
		user.setApellido(request.getParameter("apellido"));
		usuarioDao.save(user);
		status.setComplete();
		model.addAttribute("titulo","Permisos");
		flash.addFlashAttribute("success", "Cambio Exitoso");	
		return "redirect:"+url;
	}
	
	
	

}
