package com.luciano.appsalao.services;

import com.luciano.appsalao.entities.Cliente;
import com.luciano.appsalao.entities.Ordem;
import com.luciano.appsalao.repositories.ClienteRepository;
import com.luciano.appsalao.repositories.OrdemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private OrdemRepository ordemRepository;

    public void instanceDB() {

        Cliente c1 = new Cliente(null, "Maria da Silva", "12332165454", LocalDateTime.now());
        Ordem os1 = new Ordem(null, "Progressiva", LocalDateTime.now(), 1, 200.00, c1);

        c1.getOrdems().add(os1);

        clienteRepository.saveAll(Arrays.asList(c1));
        ordemRepository.saveAll(Arrays.asList(os1));
    }
}
