package tatoo.springboot.repositorio.service;

import org.springframework.data.domain.Pageable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tatoo.springboot.repositorio.dao.ProductoDao;
import tatoo.springboot.repositorio.entity.Producto;

@Service("ImplProductoDao")
public class ImplProductoDao implements ServiceProductoDao{
	
	@Autowired
	private ProductoDao productoDao;

	@Transactional
	@Override
	public void save(Producto producto) {
		// TODO Auto-generated method stub
		productoDao.save(producto);
	}

	@Override
	@Transactional	
	public Producto findOne(Long id) {
		// TODO Auto-generated method stub
		return productoDao.findOne(id);
	}

	@Override
	@Transactional	
	public void delete(Long id) {
		
		productoDao.delete(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Producto> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	@Transactional(readOnly = true)
	public Page<Producto> findAllby(Long term,Pageable pageable) {
		// TODO Auto-generated method stub
		return productoDao.findAllby(term,pageable);
	}

	
	@Override
	@Transactional(readOnly = true)
	public Page<Producto> findAllbyStyle(String nom,Long term,  Pageable pageable) {
		// TODO Auto-generated method stub
		return productoDao.findAllbyStyle(nom,term,pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Producto> findAllbyUpc(String nom,Long term,  Pageable pageable) {
		// TODO Auto-generated method stub
		return productoDao.findAllbyUpc(nom,term,pageable);
	}
	
	

	
	@Override
	@Transactional(readOnly = true)
	public Page<Producto> findAllbyNombre(String nom,Long term,  Pageable pageable) {
		// TODO Auto-generated method stub
		return productoDao.findAllbyNombre(nom,term,pageable);
	}
	
	@Transactional
	@Override
	public Iterable<Producto> saveAll(Iterable<Producto> producto) {
		// TODO Auto-generated method stub
		return productoDao.save(producto);
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findOneUpc(String upc) {
		// TODO Auto-generated method stub
		return productoDao.findOneUpc(upc);
	}

	
	@Override
	@Transactional(readOnly = true)
	public Long countByMarca(Long term) {
		// TODO Auto-generated method stub
		return productoDao.countByMarca(term);
	}

	@Override
//	@Transactional(readOnly = true)
	public Long countByMarcaNombre(String nom, Long term) {
		// TODO Auto-generated method stub
		return productoDao.countByMarcaNombre(nom,term);
	}

	@Override
	@Transactional(readOnly = true)
	public Long countByMarcaStyle(String nom, Long term) {
		// TODO Auto-generated method stub
		return productoDao.countByMarcaStyle(nom,term);
	}

	@Override
	@Transactional(readOnly = true)
	public Long countByMarcaUpc(String nom, Long term) {
		// TODO Auto-generated method stub
		return productoDao.countByMarcaUpc(nom,term);
	}

	
	@Override
	@Transactional(readOnly = true)
	public Page<Producto> findAllUpc(String upc, Pageable pageable) {
		// TODO Auto-generated method stub
		return productoDao.findAllUpc(upc,pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Long countAllUpc(String upc) {
		// TODO Auto-generated method stub
		return productoDao.countAllUpc(upc);
	}

	@Override
	public Page<Producto> findAllStyle(String style, Pageable pageable) {
		// TODO Auto-generated method stub
		return productoDao.findAllStyle(style, pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Long countAllStyle(String style) {
		// TODO Auto-generated method stub
		return productoDao.countAllStyle(style);
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Producto> findAllNombre(String nombre, Pageable pageable) {
		// TODO Auto-generated method stub
		return productoDao.findAllNombre(nombre, pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Long countAllNombre(String nombre) {
		// TODO Auto-generated method stub
		return productoDao.countAllNombre(nombre);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findProducMarca(Long marca_pk) {
		// TODO Auto-generated method stub
		return productoDao.findProducMarca(marca_pk);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAllbyNombre(String nom, Long marca_pk) {
		// TODO Auto-generated method stub
		return productoDao.findAllbyNombre(nom, marca_pk);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAllbyStyle(String nom, Long marca_pk) {
		// TODO Auto-generated method stub
		return productoDao.findAllbyStyle(nom, marca_pk);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAllbyUpc(String nom, Long marca_pk) {
		// TODO Auto-generated method stub
		return productoDao.findAllbyUpc(nom, marca_pk);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAllUpc(String upc) {
		// TODO Auto-generated method stub
		return productoDao.findAllUpc(upc);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAllNombre(String nombre) {
		// TODO Auto-generated method stub
		return productoDao.findAllNombre(nombre);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAllStyle(String style) {
		// TODO Auto-generated method stub
		return productoDao.findAllStyle(style);
	}
	

	
	

}
