package br.com.mi81.logistica.service.mapper;

import br.com.mi81.logistica.dto.cliente.ClienteRequestDto;
import br.com.mi81.logistica.dto.cliente.ClienteResponseDto;
import br.com.mi81.logistica.entity.Cliente;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public ClienteResponseDto toDto(Cliente cliente) {
        return new ClienteResponseDto(
                cliente.getId(),
                cliente.getNome(),
                cliente.getCpfCnpj(),
                cliente.getEndereco(),
                cliente.getCidade(),
                cliente.getEstado());
    }

    public Cliente toEntity(ClienteRequestDto dto) {
        return new Cliente(
                dto.nome(),
                dto.cpfCnpj(),
                dto.endereco(),
                dto.cidade(),
                dto.estado());
    }

}
