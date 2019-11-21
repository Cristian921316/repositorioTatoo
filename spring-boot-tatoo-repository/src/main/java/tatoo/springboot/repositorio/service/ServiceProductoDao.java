package tatoo.springboot.repositorio.service;



import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import tatoo.springboot.repositorio.entity.Producto;

public interface ServiceProductoDao {
	
	public Page<Producto> findAllby(Long term,Pageable pageable);
	public List<Producto> findProducMarca(Long marca_pk);
	public Long countByMarca(Long term);
	public Long countByMarcaNombre(String nom,Long term);
	public Long countByMarcaStyle(String nom,Long term);
	public Long countByMarcaUpc(String nom,Long term);
	public Page<Producto> findAllbyNombre(String nom,Long term,Pageable pageable);	
	public Page<Producto> findAllbyStyle(String nom,Long term,Pageable pageable);
	public Page<Producto> findAllbyUpc(String nom,Long term,Pageable pageable);	
	public Page<Producto> findAll(Pageable pageable);
	public void save(Producto producto);
	public Iterable<Producto> saveAll(Iterable<Producto> producto);
	public Producto findOne(Long id);
	public Producto findOneUpc(String upc);	
	public Page<Producto> findAllUpc(String upc,Pageable pageable);
	public Long countAllUpc(String upc);
	public void delete(Long id); 
	public Page<Producto> findAllStyle(String style,Pageable pageable);
	public Long countAllStyle(String style);
	public Page<Producto> findAllNombre(String nombre,Pageable pageable);
	public Long countAllNombre(String nombre);
	
	//lista por busqueda
	public List<Producto> findAllbyNombre(String nom,Long marca_pk);
	public List<Producto> findAllbyStyle(String nom,Long marca_pk);	
	public List<Producto> findAllbyUpc(String nom,Long marca_pk);	
	
	public List<Producto> findAllUpc(String upc);	
	public List<Producto> findAllNombre(String nombre);	
	public List<Producto> findAllStyle(String style);
	

}
