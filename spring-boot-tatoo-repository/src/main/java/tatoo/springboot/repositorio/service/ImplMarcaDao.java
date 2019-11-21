package tatoo.springboot.repositorio.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tatoo.springboot.repositorio.dao.MarcaDao;
import tatoo.springboot.repositorio.entity.Marca;

@Service("ImplMarcaDao")
public class ImplMarcaDao implements ServiceMarcaDao {

	@Autowired		
	private MarcaDao marcaDao;
	
	@Override
	@Transactional
	public List<Marca> findAll() {
		// TODO Auto-generated method stub
		return ((List<Marca>) marcaDao.findAll());
	}

	@Override
	public Page<Marca> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return marcaDao.findAll(pageable);
	}

	@Override
	@Transactional
	public void save(Marca marca) {
		// TODO Auto-generated method stub
		marcaDao.save(marca);
	}

	@Override
	@Transactional(readOnly = true)
	public Marca findOne(Long id) {
		// TODO Auto-generated method stub
		return marcaDao.findOne(id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		marcaDao.delete(id);
	}

	@Override
	public List<Marca> findAllOrdenado() {
		// TODO Auto-generated method stub
		return marcaDao.findAllOrdenado();
	}

	@Override
	public Page<Marca> findAllNombre(String nom, Pageable pageable) {
		// TODO Auto-generated method stub
		return marcaDao.findAllNombre(nom, pageable);
	}

	@Override
	public Long countAll() {
		// TODO Auto-generated method stub
		return marcaDao.countAll();
	}

	@Override
	public Long countAllNombre(String nom) {
		// TODO Auto-generated method stub
		return marcaDao.countAllNombre(nom);
	}

	

	

}
