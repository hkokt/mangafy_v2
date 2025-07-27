package com.mangafy.api.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@DiscriminatorValue("LIVRO")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Livro extends Publicacao {
	@Column(name = "num_paginas")
	private Integer NumPaginas;
	
	@Column(name = "storage_url")
	private String storageUrl;
}
