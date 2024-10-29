package com.examen2.service;

import java.util.List;
import java.util.Optional;

import com.examen2.entity.Escuela;

public interface EscuelaService {
	Escuela create(Escuela a);
	Escuela update(Escuela a);
	void delete(Long id);
	Optional<Escuela> read(Long id);
	List<Escuela> readAll();
}
