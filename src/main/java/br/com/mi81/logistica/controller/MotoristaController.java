package br.com.mi81.logistica.controller;

import br.com.mi81.logistica.dto.motorista.MotoristaRequestDto;
import br.com.mi81.logistica.dto.motorista.MotoristaResponseDto;
import br.com.mi81.logistica.service.MotoristaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/motoristas")
public class MotoristaController {

    @Autowired
    private MotoristaService motoristaService;

    @PostMapping
    public ResponseEntity<MotoristaResponseDto> post(@RequestBody MotoristaRequestDto dto) {
        return ResponseEntity.ok().body(motoristaService.insert(dto));
    }

    @GetMapping
    public ResponseEntity<List<MotoristaResponseDto>> getAll(){
        return ResponseEntity.ok(motoristaService.findAll());
    }

}
