package com.examen2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen2.entity.Facultad;

@Repository
public interface FacultadRepository extends JpaRepository<Facultad, Long>{
	
}
