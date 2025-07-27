package com.mangafy.api.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mangafy.api.application.service.IGeneroService;
import com.mangafy.api.domain.entity.Genero;
import com.mangafy.api.domain.repository.GeneroRepository;

@Service
public class GeneroService implements IGeneroService {
	@Autowired
	private GeneroRepository generoRepository;
	
	@Override
	public List<Genero> findAll() {
		return this.generoRepository.findAll();
	}

}
