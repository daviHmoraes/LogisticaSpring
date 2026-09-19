package br.com.mi81.logistica.dto.motorista;

import jakarta.validation.constraints.NotBlank;

public record MotoristaRequestDto (

        @NotBlank
        String nome,

        @NotBlank
        String cnh,

        @NotBlank
        String veiculo,

        @NotBlank
        String cidadeBase

) {}
