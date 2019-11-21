package tatoo.springboot.repositorio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tatoo.springboot.repositorio.dao.RepDetAuditoriaDao;
import tatoo.springboot.repositorio.entity.RepDetAuditoria;

@Controller
public class AuditoriaController {
	
	@Autowired
	private RepDetAuditoriaDao historialDao;
	
	@GetMapping({"/listarAuditoria"})
	public String inicio(Model model) {		
		model.addAttribute("titulo", "Auditoria");		
		return "/listarAuditoria";
	}
	
	@RequestMapping(value="listarAuditoria/{term}", method=RequestMethod.GET)
	public String inicio(@PathVariable(value="term") String term,Model model) {		
		List<RepDetAuditoria> historial = historialDao.historial(term);
		model.addAttribute("titulo", "Auditoria");	
		model.addAttribute("historial", historial);	
		return "/listarAuditoria";
	}
}
