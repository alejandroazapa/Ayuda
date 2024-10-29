package com.examen2.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examen2.dao.EscuelaDao;
import com.examen2.entity.Escuela;
import com.examen2.repository.EscuelaRepository;

@Component
public class EscuelaDaoImpl implements EscuelaDao{
	@Autowired
	private EscuelaRepository repository;
	
	@Override
	public Escuela create(Escuela a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Escuela update(Escuela a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Escuela> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Escuela> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
}