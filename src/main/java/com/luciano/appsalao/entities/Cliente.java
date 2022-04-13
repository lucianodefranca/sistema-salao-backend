package com.luciano.appsalao.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private Integer id;
    private String name;
    private String cpf;
    private LocalDateTime date;

    private List<Ordem> ordems = new ArrayList<>();

    public Cliente() {}

    public Cliente(Integer id, String name, String cpf, LocalDateTime date) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public List<Ordem> getOrdems() {
        return ordems;
    }

    public void setOrdems(List<Ordem> ordems) {
        this.ordems = ordems;
    }
}
