package com.mangafy.api.domain.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mangafy.api.domain.entity.Publicacao;

@Repository
public interface PublicacaoRepository extends JpaRepository<Publicacao, Long>{

}
