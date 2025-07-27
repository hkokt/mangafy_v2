package com.mangafy.api.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mangafy.api.application.dto.PublicacaoDto;
import com.mangafy.api.application.service.ILivroService;
import com.mangafy.api.domain.entity.Livro;

import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/livros")
public class LivroController {
	@Autowired
	private ILivroService livroService;
	
	@GetMapping
	public ResponseEntity<List<Livro>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(this.livroService.findAll());
	}
	
	@GetMapping("/{id}") 
	public ResponseEntity<Livro> findById(@PathVariable Long id) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(this.livroService.findById(id));
		} catch (EntityNotFoundException e) {			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}		
	}
	
	@PostMapping
	public ResponseEntity<Livro> create(@RequestBody @Valid PublicacaoDto dto) {
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(this.livroService.create(dto));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Livro> update(@PathVariable Long id, @RequestBody @Valid PublicacaoDto dto) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(this.livroService.update(id, dto));
		} catch (EntityNotFoundException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping("/{id}") 
	public ResponseEntity<Livro> delete(@PathVariable Long id) {
		try {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(this.livroService.delete(id));
		} catch (EntityNotFoundException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
