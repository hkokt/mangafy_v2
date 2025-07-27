package com.mangafy.api.application.service;

import java.util.List;

import com.mangafy.api.application.dto.CapituloDto;
import com.mangafy.api.domain.entity.Capitulo;

public interface ICapituloService {
	List<Capitulo> findAllByMangaId(Long id);
	Capitulo create(CapituloDto dto);
	Capitulo delete(Integer id); 
}
