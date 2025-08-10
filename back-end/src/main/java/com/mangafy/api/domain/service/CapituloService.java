package com.mangafy.api.domain.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.mangafy.api.application.service.ICapituloService;
import com.mangafy.api.application.service.IStorageService;
import com.mangafy.api.domain.entity.Capitulo;
import com.mangafy.api.domain.entity.Manga;
import com.mangafy.api.domain.entity.Pagina;
import com.mangafy.api.domain.repository.CapituloRepository;

@Service
public class CapituloService implements ICapituloService {
	@Autowired
	private CapituloRepository capituloRepository;

	@Autowired
	private MangaService mangaService;

	@Autowired
	private IStorageService storageService;

	@Override
	public List<Capitulo> findAllByMangaId(Long id) {
		return this.capituloRepository.findAllByMangaId(id);
	}

	@Override
	public Capitulo create(Long mangaId, List<MultipartFile> imagens) throws IOException, Exception {
		Manga manga = this.mangaService.updateQtyChapters(mangaId);
		
		String titulo = manga.getTitulo().trim();
		String capitulo = "chapter" + manga.getQtdCapitulos();
		
		String initialPath = "/" + manga.getAutor().getId() + "/" + titulo + "/content/" + capitulo;

		Capitulo capituloModel = new Capitulo();
		List<Pagina> paginas = new ArrayList<>();
		
		for (int i = 0; i < imagens.size(); i++) {
			MultipartFile imagem = imagens.get(i);
			String storageUrl = initialPath + "/" + i;
			storageService.upload(storageUrl, imagem.getInputStream(), imagem.getContentType(), imagem.getSize());
			paginas.add(new Pagina(storageUrl));
		}
		
		capituloModel.setManga(manga);
		capituloModel.setPaginas(paginas);
		
		return this.capituloRepository.save(capituloModel);
	}

	@Override
	public Capitulo delete(Integer id) {
		return null;
	}

}
