package br.com.mi81.logistica.repository;

import br.com.mi81.logistica.entity.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ClienteRepository {

    private List<Cliente> list = new ArrayList<>();
    private AtomicLong sequencialId = new AtomicLong(1);

    public Optional<Cliente> findById(Long id) {
        return list.stream()
                    .filter(c -> c.getId().equals(id))
                    .findFirst();
    }

    public List<Cliente> findAll() {
        return list;
    }

    public Optional<Cliente> findByCpfCnpj(String cpfCnpj) {
        return list.stream()
                .filter(c -> c.getCpfCnpj().equals(cpfCnpj))
                .findFirst();
    }

    public Cliente insert(Cliente cliente) {
        cliente.setId(sequencialId.getAndIncrement());
        list.add(cliente);
        return cliente;
    }

    public boolean delete(Long id) {
        return list.removeIf(c -> c.getId().equals(id));
    }

}
