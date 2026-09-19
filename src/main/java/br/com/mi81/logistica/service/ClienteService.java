package br.com.mi81.logistica.service;

import br.com.mi81.logistica.dto.cliente.ClienteRequestDto;
import br.com.mi81.logistica.dto.cliente.ClienteResponseDto;
import br.com.mi81.logistica.repository.ClienteRepository;
import br.com.mi81.logistica.service.mapper.ClienteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteMapper mapper;

    public List<ClienteResponseDto> findAll() {
        return clienteRepository.findAll().stream()
                .map(c -> mapper.toDto(c))
                .toList();
    }

    public Optional<ClienteResponseDto> findById(Long id) {
        return clienteRepository.findById(id).stream()
                .map(c -> mapper.toDto(c))
                .findFirst();
    }

    public Optional<ClienteResponseDto> findByCpfCnpj(String cpfCnpj) {
        return clienteRepository.findByCpfCnpj(cpfCnpj).stream()
                .map(c -> mapper.toDto(c))
                .findFirst();
    }

    public ClienteResponseDto insert(ClienteRequestDto dto) {
        return mapper.toDto(clienteRepository.insert(mapper.toEntity(dto)));
    }

    public boolean delete(Long id) {
        return clienteRepository.delete(id);
    }

}
