package com.mangafy.api.application.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import com.mangafy.api.domain.entity.Capitulo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record PublicacaoDto(
		@NotNull UUID autorId,
        @NotEmpty List<Integer> generosIds,
        @NotBlank String titulo,
        @NotBlank String sinopse,
        @NotNull LocalDateTime dataDeLancamento,
        @Size(min = 10, max = 10) String ISBN10,
        @Size(min = 13, max = 13) String ISBN13,
        String capaUrl,
        @NotNull Integer numPaginas,
        String storageUrl,
        Integer qtdCapitulos,
        List<Capitulo> capitulos
) {

}
