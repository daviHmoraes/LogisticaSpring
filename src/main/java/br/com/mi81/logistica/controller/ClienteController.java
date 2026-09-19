package br.com.mi81.logistica.controller;

import br.com.mi81.logistica.dto.cliente.ClienteRequestDto;
import br.com.mi81.logistica.dto.cliente.ClienteResponseDto;
import br.com.mi81.logistica.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClienteResponseDto> post(@RequestBody ClienteRequestDto dto) {
        return ResponseEntity.ok().body(clienteService.insert(dto));
    }

    @GetMapping
    public ResponseEntity<List<ClienteResponseDto>> findAll() {
        return ResponseEntity.ok(clienteService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponseDto> findById(@PathVariable Long id) {
        Optional<ClienteResponseDto> cliente = clienteService.findById(id);

        if(cliente.isPresent()) {
            return ResponseEntity.ok().body(cliente.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/busca")
    public ResponseEntity<ClienteResponseDto> findByDocument(@RequestParam String cpfCnpj) {
        Optional<ClienteResponseDto> clienteResponseDto = clienteService.findByCpfCnpj(cpfCnpj);

        if(clienteResponseDto.isPresent()) {
            return ResponseEntity.ok().body(clienteResponseDto.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}