package com.mangafy.api.application.service;

import java.util.List;

import com.mangafy.api.application.dto.PublicacaoDto;
import com.mangafy.api.domain.entity.Livro;

public interface ILivroService {
	List<Livro> findAll();
	Livro findById(Long id);
	Livro create(PublicacaoDto dto);
	Livro update(Long id, PublicacaoDto dto);
	Livro delete(Long id);
}
