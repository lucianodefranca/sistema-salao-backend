package com.luciano.appsalao.dtos;

import com.luciano.appsalao.entities.Cliente;

import java.time.LocalDateTime;

public class ClienteDTO {

    private Integer id;
    private String name;
    private String cpf;
    private LocalDateTime date;

    public ClienteDTO() {}

    public ClienteDTO(Cliente dto) {
        this.id = dto.getId();
        this.name = dto.getName();
        this.cpf = dto.getCpf();
        this.date = dto.getDate();
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
}
