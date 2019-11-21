package tatoo.springboot.repositorio.controllers;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import tatoo.springboot.repositorio.auth.handler.LoginSuccessHandler;
import tatoo.springboot.repositorio.dao.RepDetAuditoriaDao;
import tatoo.springboot.repositorio.entity.RepDetAuditoria;


@Controller

public class LoginController {
	
		
	@RequestMapping({"/login"})
	public String login(@RequestParam(value="error", required=false) String error,
			@RequestParam(value="logout", required = false) String logout,
			Model model, Principal principal, RedirectAttributes flash) {	
		
		if(principal != null) {
			model.addAttribute("titulo", "Inicio");
			flash.addFlashAttribute("info", "Ya ha iniciado sesión anteriormente");
			return "redirect:/";
			
		}
		
		if(error != null) {
			model.addAttribute("titulo", "Error de Ingreso");
			model.addAttribute("error", "Error en el login: Nombre de usuario o contraseña incorrecta, por favor vuelva a intentarlo!");
		}
		
		if(logout != null) {
			model.addAttribute("titulo", "Inicio");
			model.addAttribute("success", "Ha cerrado sesión con éxito!");
			
			
		}
		model.addAttribute("titulo", "Login");		
		return "/login";
	}
	
	@GetMapping({"/"})
	public String inicio(Model model) {		
		model.addAttribute("titulo", "Inicio");		
		return "/inicio";
	}
}
