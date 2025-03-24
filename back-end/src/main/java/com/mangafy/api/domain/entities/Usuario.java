package com.mangafy.api.domain.entities;

import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Usuario {
	private UUID id;
	private String email;
	private String nome;
	private String apelido;
}
