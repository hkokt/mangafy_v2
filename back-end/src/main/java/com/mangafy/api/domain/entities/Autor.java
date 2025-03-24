package com.mangafy.api.domain.entities;

import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Autor extends Usuario {
	private String cpf;
	private String cnpj;
	
	public Autor(UUID id, String email, String nome, String apelido, String cpf, String cnpj) {
		this.setId(id);
        this.setEmail(email);
        this.setNome(nome);
        this.setApelido(apelido);
        this.cpf = cpf;
        this.cnpj = cnpj;
    }
}
