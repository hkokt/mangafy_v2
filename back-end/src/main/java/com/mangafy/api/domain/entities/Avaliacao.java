package com.mangafy.api.domain.entities;

import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Avaliacao {
	private long id;
	private float nota;
	private String descricao;
	
	private UUID leitorId;
	private int publicacaoId;
}
