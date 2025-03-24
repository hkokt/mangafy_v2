package com.mangafy.api.domain.entities;

import java.util.List;
import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Comentario {
	private long id;
	private String descricao;
	private List<Comentario> comentarios;
	
	private UUID leitorId;
	private int publicacaoId;
	
	private long comentarioPaiId;
}
