package br.com.mi81.logistica.dto.cliente;

import jakarta.validation.constraints.NotBlank;

public record ClienteRequestDto (

        @NotBlank
        String nome,

        @NotBlank
        String cpfCnpj,

        @NotBlank
        String endereco,

        @NotBlank
        String cidade,

        @NotBlank
        String estado
) {}
