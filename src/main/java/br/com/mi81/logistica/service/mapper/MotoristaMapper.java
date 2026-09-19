package br.com.mi81.logistica.service.mapper;

import br.com.mi81.logistica.dto.motorista.MotoristaRequestDto;
import br.com.mi81.logistica.dto.motorista.MotoristaResponseDto;
import br.com.mi81.logistica.entity.Motorista;
import org.springframework.stereotype.Component;

@Component
public class MotoristaMapper {

    public MotoristaResponseDto toDto(Motorista motorista){
        return new MotoristaResponseDto(
                motorista.getId(),
                motorista.getNome(),
                motorista.getCnh(),
                motorista.getVeiculo(),
                motorista.getCidadeBase());
    }

    public Motorista toEntity(MotoristaRequestDto dto){
        return new Motorista(
                dto.nome(),
                dto.cnh(),
                dto.veiculo(),
                dto.cidadeBase());
    }
}
