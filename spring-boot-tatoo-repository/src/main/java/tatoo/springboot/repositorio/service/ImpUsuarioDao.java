package tatoo.springboot.repositorio.service;

import org.springframework.beans.factory.annotation.Autowired;

import tatoo.springboot.repositorio.dao.IUsuarioDao;
import tatoo.springboot.repositorio.entity.Usuario;

public class ImpUsuarioDao implements ServiceUsuarioDao {
	
	@Autowired
	private IUsuarioDao usuarioDao;

	@Override
	public Usuario findByClave(String clave) {
		// TODO Auto-generated method stub
		return usuarioDao.findByClave(clave);
	}
	

}
