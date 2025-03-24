package com.mangafy.api.domain.entities;

import java.util.List;
import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Leitor extends Usuario {
	private List<Publicacao> lerMaisTarde;
	
	public Leitor(UUID id, String email, String nome, String apelido, String cpf, String cnpj, List<Publicacao> lerMaisTarde) {
        this.setId(id);
        this.setEmail(email);
        this.setNome(nome);
        this.setApelido(apelido);
        this.lerMaisTarde = lerMaisTarde;
    }
}
