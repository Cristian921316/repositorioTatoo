package tatoo.springboot.repositorio.dao;




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import tatoo.springboot.repositorio.entity.Marca;


public interface MarcaDao extends PagingAndSortingRepository<Marca, Long> {
	
	@Query("select count(m) from Marca m ")
	public Long countAll();
	
	@Query("select m from Marca m group by nombre ")
	public List<Marca> findAllOrdenado();
	
	@Query("select m from Marca m where m.nombre like %?1% ")
	public Page<Marca> findAllNombre(String nom,Pageable pageable);
	@Query("select count(m) from Marca m where m.nombre like %?1% ")
	public Long countAllNombre(String nom);
	
	

}
