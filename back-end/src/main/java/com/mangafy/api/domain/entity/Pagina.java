package com.mangafy.api.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "paginas")
@Setter
public class Pagina {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "storage_url")
	private String storageUrl;
	
	@ManyToOne
    @JoinColumn(name = "capitulo_id") // cria a coluna FK na tabela 'paginas'
    @JsonIgnore
	private Capitulo capitulo;
	
	public Pagina(String storageUrl) {
		this.setStorageUrl(storageUrl);
	}
}
