package com.luciano.appsalao.services;

import com.luciano.appsalao.entities.Cliente;
import com.luciano.appsalao.entities.Ordem;
import com.luciano.appsalao.entities.enums.Status;
import com.luciano.appsalao.repositories.ClienteRepository;
import com.luciano.appsalao.repositories.OrdemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private OrdemRepository ordemRepository;

    public void instanceDB() {

        Cliente c1 = new Cliente(null, "Maria da Silva", "12332165454", LocalDateTime.now());
        Cliente c2 = new Cliente(null, "Joana de Souza", "19876543211", LocalDateTime.now());

        Ordem os1 = new Ordem(null, "Progressiva", LocalDateTime.now(), Status.ABERTO, 200.00, c1);
        Ordem os2 = new Ordem(null, "Mechas", LocalDateTime.now(), Status.ABERTO, 430.00, c1);
        Ordem os3 = new Ordem(null, "Raiz e escova", LocalDateTime.now(), Status.ENCERRADO, 120.00, c2);

        c1.getOrdems().addAll(Arrays.asList(os1, os2));
        c2.getOrdems().addAll(Arrays.asList(os3));

        clienteRepository.saveAll(Arrays.asList(c1, c2));
        ordemRepository.saveAll(Arrays.asList(os1, os2, os3));
    }
}
