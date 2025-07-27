package com.mangafy.api.domain.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "manga", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Capitulo> capitulos;
}
