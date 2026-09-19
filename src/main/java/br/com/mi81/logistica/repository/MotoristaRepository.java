package br.com.mi81.logistica.repository;

import br.com.mi81.logistica.entity.Motorista;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class MotoristaRepository {

    private List<Motorista> list = new ArrayList<>();
    private AtomicLong sequenciaId = new AtomicLong(1);

    public List<Motorista> findAll(){
        return list;
    }

    public Motorista insert(Motorista motorista){
        motorista.setId(sequenciaId.getAndIncrement());
        list.add(motorista);
        return motorista;
    }
}
