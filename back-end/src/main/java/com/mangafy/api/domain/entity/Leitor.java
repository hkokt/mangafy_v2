package com.mangafy.api.domain.entity;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.JoinColumn;
import lombok.Setter;

@DiscriminatorValue("LEITOR")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Leitor extends Usuario {
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name = "leitor_id"), name = "ler_mais_tarde", inverseJoinColumns = @JoinColumn(name = "publicacao_id"))
	private List<Publicacao> lerMaisTarde;

	@OneToMany(mappedBy = "leitor", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Avaliacao> avaliacoes;

	public Leitor(UUID id, String email, String nome, String apelido, String cpf, String cnpj,
			List<Publicacao> lerMaisTarde, List<Avaliacao> avaliacoes) {
		this.setId(id);
		this.setEmail(email);
		this.setNome(nome);
		this.setApelido(apelido);
		this.lerMaisTarde = lerMaisTarde;
		this.avaliacoes = avaliacoes;
	}
}
