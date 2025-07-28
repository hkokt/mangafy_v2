package com.mangafy.api.domain.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "avaliacoes")
@Setter
public class Avaliacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private BigDecimal nota;

	@Column(length = 200)
	private String descricao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "leitor_id", nullable = false)
	@JsonIgnore
	private Leitor leitor;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "publicacao_id", nullable = false)
	@JsonIgnore
	private Publicacao publicacao;
}
