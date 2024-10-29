package com.examen2.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen2.entity.Escuela;
import com.examen2.repository.EscuelaRepository;
import com.examen2.service.EscuelaService;

@Service
public class EscuelaServiceImpl implements EscuelaService{
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
