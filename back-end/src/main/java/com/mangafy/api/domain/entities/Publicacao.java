package com.mangafy.api.domain.entities;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Publicacao {
	private int id;
	private Autor autor;
	private List<Genero> generos;
	private String titulo;
	private String sinopse;
	private LocalDateTime DataDeLancamento;
	private String ISBN10;
	private String ISBN13;
	private String capaUrl;
	private PublicationType tipo;
	private List<Comentario> comentarios;
	private List<Avaliacao> avaliacoes;
}
