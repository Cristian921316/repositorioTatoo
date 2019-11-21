package tatoo.springboot.repositorio.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import tatoo.springboot.repositorio.entity.Marca;



public interface ServiceMarcaDao {

	public List<Marca> findAll();
	
	public Page<Marca> findAll(Pageable pageable);	

	public void save(Marca marca);
	
	public Marca findOne(Long id);
	
	public void delete(Long id);
	
	public List<Marca> findAllOrdenado();	
	public Page<Marca> findAllNombre(String nom,Pageable pageable);
	
	public Long countAll();
	
	public Long countAllNombre(String nom);
	
}
