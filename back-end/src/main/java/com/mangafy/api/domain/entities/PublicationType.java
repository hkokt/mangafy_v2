package com.mangafy.api.domain.entities;

import lombok.Getter;

public enum PublicationType {
	LIVRO(0),
	MANGA(1);
	
	@Getter
	private int val;
	
	PublicationType(int val) {
		this.val = val;
	}
}
