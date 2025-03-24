package com.mangafy.api.domain.entities;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Livro extends Publicacao {
	private int NumPaginas;
	private String storageUrl;
	
	public Livro(int id, Autor autor, List<Genero> generos, String titulo, String sinopse, LocalDateTime DataDeLancamento, 
            String ISBN10, String ISBN13, String capaUrl, PublicationType tipo, 
            List<Comentario> comentarios, List<Avaliacao> avaliacoes, int NumPaginas, String storageUrl) {
	   this.setId(id);
	   this.setAutor(autor);
	   this.setGeneros(generos);
	   this.setTitulo(titulo);
	   this.setSinopse(sinopse);
	   this.setDataDeLancamento(DataDeLancamento);
	   this.setISBN10(ISBN10);
	   this.setISBN13(ISBN13);
	   this.setCapaUrl(capaUrl);
	   this.setTipo(tipo);
	   this.setComentarios(comentarios);
	   this.setAvaliacoes(avaliacoes);
	   this.NumPaginas = NumPaginas;
	   this.storageUrl = storageUrl;
	}
}
