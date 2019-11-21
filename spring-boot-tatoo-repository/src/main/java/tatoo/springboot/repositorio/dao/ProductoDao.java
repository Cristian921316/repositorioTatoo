package tatoo.springboot.repositorio.dao;

import org.springframework.data.domain.Pageable;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tatoo.springboot.repositorio.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {

	@Query("select p from Producto p where p.marca_pk.marca_pk = ? ")
	public Page<Producto> findAllby(Long marca_pk,Pageable pageable);	
	@Query("select p from Producto p where p.marca_pk.marca_pk = ? ")
	public List<Producto> findProducMarca(Long marca_pk);	
	@Query("select count(p) from Producto p where p.marca_pk.marca_pk = ? ")
	public Long countByMarca(Long marca_pk);
	
	@Query("select p from Producto p where p.nombre like %?1% AND p.marca_pk.marca_pk = ?2  ")
	public Page<Producto> findAllbyNombre(String nom,Long marca_pk,Pageable pageable);	
	@Query("select count(p) from Producto p where p.nombre like %?1% AND p.marca_pk.marca_pk = ?2 ")
	public Long countByMarcaNombre(String nom,Long marca_pk);	
	@Query("select p from Producto p where p.nombre like %?1% AND p.marca_pk.marca_pk = ?2  ")
	public List<Producto> findAllbyNombre(String nom,Long marca_pk);	
	
	
	@Query("select p from Producto p where p.style_number like %?1% AND p.marca_pk.marca_pk = ?2 ")
	public Page<Producto> findAllbyStyle(String nom,Long marca_pk,Pageable pageable);	
	@Query("select count(p) from Producto p where p.style_number like %?1% AND p.marca_pk.marca_pk = ?2 ")
	public Long countByMarcaStyle(String nom,Long marca_pk);
	@Query("select p from Producto p where p.style_number like %?1% AND p.marca_pk.marca_pk = ?2 ")
	public List<Producto> findAllbyStyle(String nom,Long marca_pk);	
	
	
	@Query("select p from Producto p where p.upc = ?1 AND p.marca_pk.marca_pk = ?2")
	public Page<Producto> findAllbyUpc(String nom,Long marca_pk,Pageable pageable);	
	@Query("select count(p) from Producto p where p.upc = ?1 AND p.marca_pk.marca_pk = ?2")
	public Long countByMarcaUpc(String nom,Long marca_pk);
	@Query("select p from Producto p where p.upc = ?1 AND p.marca_pk.marca_pk = ?2")
	public List<Producto> findAllbyUpc(String nom,Long marca_pk);	
	
	
	//busqueda individual por upc del producto
	@Query("select p from Producto p where p.upc = ? ")
	public Producto findOneUpc(String upc);
	
	
	
	@Query("select p from Producto p where p.upc like %?1% ")
	public Page<Producto> findAllUpc(String upc,Pageable pageable);	
	@Query("select count(p) from Producto p where p.upc like %?1% ")
	public Long countAllUpc(String upc);
	@Query("select p from Producto p where p.upc like %?1% ")
	public List<Producto> findAllUpc(String upc);	
	
	
	@Query("select p from Producto p where p.style_number like %?1% ")
	public Page<Producto> findAllStyle(String style,Pageable pageable);	
	@Query("select count(p) from Producto p where p.style_number like %?1% ")
	public Long countAllStyle(String style);
	@Query("select p from Producto p where p.style_number like %?1% ")
	public List<Producto> findAllStyle(String style);	
	
	
	@Query("select p from Producto p where p.nombre like %?1% ")
	public Page<Producto> findAllNombre(String nombre,Pageable pageable);	
	@Query("select count(p) from Producto p where p.nombre like %?1% ")
	public Long countAllNombre(String nombre);
	@Query("select p from Producto p where p.nombre like %?1% ")
	public List<Producto> findAllNombre(String nombre);	
}
