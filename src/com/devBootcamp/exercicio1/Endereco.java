package com.devBootcamp.exercicio1;

import java.util.Objects;

public class Endereco {
    private Long id;
    private String rua;
    private Integer numero;
    private String bairro;

    public Endereco(Long id, String rua, Integer numero, String bairro) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
    }

    public Long getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return Objects.equals(id, endereco.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
