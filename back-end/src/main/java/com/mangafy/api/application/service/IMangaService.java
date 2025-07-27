package com.mangafy.api.application.service;

import java.util.List;

import com.mangafy.api.application.dto.PublicacaoDto;
import com.mangafy.api.domain.entity.Manga;

public interface IMangaService {
	List<Manga> findAll();
	Manga findById(Long id);
	Manga create(PublicacaoDto dto);
	Manga update(Long id, PublicacaoDto dto);
	Manga delete(Long id);
}
