package tatoo.springboot.repositorio.auth.handler;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.support.SessionFlashMapManager;

import tatoo.springboot.repositorio.auditoria.AuditoriaSave;
import tatoo.springboot.repositorio.dao.IUsuarioDao;
import tatoo.springboot.repositorio.entity.Usuario;


@Component
public class LoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler{

	private String lstrPais;
	
	@Autowired
	private AuditoriaSave auditoria;
	
	@Autowired
	private IUsuarioDao userDao;
	
	
	public Usuario user;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {

		SessionFlashMapManager flashMapManager = new SessionFlashMapManager();
		System.out.println(request.getParameter("txtPais"));
		FlashMap flashMap = new FlashMap();
		
		//pais
		System.out.println("Usuario"+authentication.getPrincipal());		
		user = userDao.findByUsername(authentication.getName());
		
		flashMap.put("success", "" +authentication.getName()+ ", haz iniciado sesión con éxito!");		
		flashMapManager.saveOutputFlashMap(flashMap, request, response);
		
		if(authentication != null) {
			logger.info("El usuario '"+authentication.getName()+"' ha iniciado sesión con éxito");
		}
		
		super.onAuthenticationSuccess(request, response, authentication);
	}

	
	

	
}
