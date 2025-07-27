package com.mangafy.api.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mangafy.api.application.dto.CapituloDto;
import com.mangafy.api.application.service.ICapituloService;
import com.mangafy.api.domain.entity.Capitulo;
import com.mangafy.api.domain.entity.Manga;
import com.mangafy.api.domain.repository.CapituloRepository;

@Service
public class CapituloService implements ICapituloService {
	@Autowired
	private CapituloRepository capituloRepository;
	
	@Autowired
	private MangaService mangaService;
	
	@Override
	public List<Capitulo> findAllByMangaId(Long id) {
		return this.capituloRepository.findAllByMangaId(id);
	}

	@Override
	public Capitulo create(CapituloDto dto) {
		Manga manga = this.mangaService.findById(dto.MangaId());
		
		Capitulo capituloModel = new Capitulo();
		
		capituloModel.setManga(manga);
		capituloModel.setStorageUrl(dto.storageUrl());
		
		return this.capituloRepository.save(capituloModel);
	}

	@Override
	public Capitulo delete(Integer id) {
		return null;
	}

}
