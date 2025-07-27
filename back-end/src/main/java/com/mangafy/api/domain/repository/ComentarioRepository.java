package com.mangafy.api.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mangafy.api.domain.entity.Comentario;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
	@Query(value = "", nativeQuery = true)
	List<Comentario> findAllByPublicacaoId(Long publicacao);
}
