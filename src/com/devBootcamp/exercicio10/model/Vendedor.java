package com.devBootcamp.exercicio10.model;

import com.devBootcamp.exercicio10.dao.BaseObject;

public class Vendedor extends BaseObject {
    //Criar a classe Vendedor com os atributos id, nome, percentual de comissão,
    // percentual de desconto máximo. O atributo nome é obrigatório;

    private String nome;
    private Double comissao;
    private Double maxDesconto;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public Double getMaxDesconto() {
        return maxDesconto;
    }

    public void setMaxDesconto(Double maxDesconto) {
        this.maxDesconto = maxDesconto;
    }
}
