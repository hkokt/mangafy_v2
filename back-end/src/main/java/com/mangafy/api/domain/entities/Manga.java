package com.mangafy.api.domain.entities;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Manga extends Publicacao {
	private int qtdCapitulos;
	private List<Capitulo> capitulos;
}
