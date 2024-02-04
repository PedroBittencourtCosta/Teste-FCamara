package com.pedrobittencourt.TesteFCamara.model.DTOs;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestEstabelecimentoDTO(
                @NotNull @NotBlank
                String nome,
                @NotNull @NotBlank
                String cnpj,
                @NotNull @NotBlank
                String endereco,
                @NotNull @NotBlank
                String telefone,
                @NotNull @Min(value = 0)
                int qtdVagasMotos,
                @NotNull @Min(value = 0)
                int qtdVagasCarros
        ) {
}
