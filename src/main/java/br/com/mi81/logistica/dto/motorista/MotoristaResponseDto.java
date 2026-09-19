package br.com.mi81.logistica.dto.motorista;

import jakarta.validation.constraints.NotBlank;
import lombok.NonNull;

public record MotoristaResponseDto (

    @NonNull
    Long id,

    @NotBlank
    String nome,

    @NotBlank
    String cnh,

    @NotBlank
    String veiculo,

    @NotBlank
    String cidadeBase
    ){}
