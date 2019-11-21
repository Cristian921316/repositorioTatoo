package tatoo.springboot.repositorio.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tatoo.springboot.repositorio.entity.Usuario;



public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

	public Usuario findByUsername(String username);
	
	@Query("select u from Usuario u where u.password = ? ")
	public Usuario findByClave(String clave);

}
