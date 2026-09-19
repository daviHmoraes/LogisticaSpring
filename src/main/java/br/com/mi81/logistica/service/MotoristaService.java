package br.com.mi81.logistica.service;

import br.com.mi81.logistica.dto.motorista.MotoristaRequestDto;
import br.com.mi81.logistica.dto.motorista.MotoristaResponseDto;
import br.com.mi81.logistica.repository.MotoristaRepository;
import br.com.mi81.logistica.service.mapper.MotoristaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotoristaService {

    @Autowired
    private MotoristaRepository motoristaRepository;

    @Autowired
    private MotoristaMapper mapper;

    public List<MotoristaResponseDto> findAll(){
         return motoristaRepository.findAll()
                 .stream()
                 .map(m -> mapper.toDto(m))
                 .toList();
    }

    public MotoristaResponseDto insert(MotoristaRequestDto dto){
        return mapper.toDto(motoristaRepository.insert(mapper.toEntity(dto)));
    }

}
