package tatoo.springboot.repositorio.service;

import tatoo.springboot.repositorio.entity.Usuario;

public interface ServiceUsuarioDao  {
	public Usuario findByClave(String clave);

}
