package br.com.mi81.logistica.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Pedido {

    @NotBlank
    private Long id;

    @NotNull
    private Long clienteId;

    @NotNull
    private Double volumeM3;

    @NotNull
    private Double pesoKg;

}
