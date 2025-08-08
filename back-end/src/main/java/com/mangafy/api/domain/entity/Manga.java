package com.mangafy.api.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@DiscriminatorValue("MANGA")
@Entity
@Getter
@NoArgsConstructor
@Setter
public class Manga extends Publicacao {
	@Column(name = "qtd_capitulos")
	private Integer qtdCapitulos;
}
