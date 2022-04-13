package com.luciano.appsalao.entities;

import java.time.LocalDateTime;

public class Ordem {

    private Integer id;
    private String description;
    private LocalDateTime date;
    private Integer status;
    private Double value;
    private Cliente cliente;

    public Ordem() {}

    public Ordem(Integer id, String description, LocalDateTime date, Integer status, Double value, Cliente cliente) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.status = status;
        this.value = value;
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
