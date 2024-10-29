package com.examen2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen2.entity.Escuela;
import com.examen2.service.EscuelaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/escuela")
@CrossOrigin(origins = "http://localhost:4200")
public class EscuelaController {
	@Autowired
	private EscuelaService escuelaService;
	@GetMapping
	public ResponseEntity<List<Escuela>> readAll(){
		try {
			List<Escuela> escuelas = escuelaService.readAll();
			if (escuelas.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(escuelas, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping
	public ResponseEntity<Escuela> crear(@Valid @RequestBody Escuela esc){
		try {
			Escuela a = escuelaService.create(esc);
			return new ResponseEntity<>(a, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Escuela> getEscuelaId(@PathVariable("id") Long id){
		try {
			Escuela a = escuelaService.read(id).get();
			return new ResponseEntity<>(a, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Escuela> delEscuela(@PathVariable("id") Long id){
		try {
			escuelaService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<Escuela> updateEscuela(@PathVariable("id") Long id, @Valid @RequestBody Escuela esc){

			Optional<Escuela> a = escuelaService.read(id);
			if(a.isEmpty()) {
				return new ResponseEntity<>(escuelaService.update(esc), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
			
	}
}
