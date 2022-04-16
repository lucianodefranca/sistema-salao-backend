package com.luciano.appsalao.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.luciano.appsalao.entities.enums.Status;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Ordem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime date;
    private Integer status;
    private Double value;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Ordem() {
        this.date = LocalDateTime.now();
        this.setStatus(Status.ABERTO);
    }

    public Ordem(Integer id, String description, LocalDateTime date, Status status, Double value, Cliente cliente) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.status = (status == null) ? 0 : status.getCod();
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

    public Status getStatus() {
        return Status.toEnum(this.status);
    }

    public void setStatus(Status status) {
        this.status = status.getCod();
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
