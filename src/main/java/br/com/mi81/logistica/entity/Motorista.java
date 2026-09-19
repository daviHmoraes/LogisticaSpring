package br.com.mi81.logistica.entity;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Motorista {

    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    private String cnh;

    @NotBlank
    private String veiculo;

    @NotBlank
    private String cidadeBase;

    public Motorista(String nome, String cnh, String veiculo, String cidadeBase) {
        this.nome = nome;
        this.cnh = cnh;
        this.veiculo = veiculo;
        this.cidadeBase = cidadeBase;
    }
}
