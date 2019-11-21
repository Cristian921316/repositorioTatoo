package tatoo.springboot.repositorio.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tatoo.springboot.repositorio.entity.RepDetAuditoria;

public interface RepDetAuditoriaDao extends CrudRepository<RepDetAuditoria,Long>{
	
	@Query("select a from RepDetAuditoria a where  a.valor_ant like %?1% or  a.valor_nuevo like %?1% ")
	public List<RepDetAuditoria> historial(String upc);
	
}
