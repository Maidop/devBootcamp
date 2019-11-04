package com.devBootcamp.exercicio10.model;

import com.devBootcamp.exercicio10.dao.BaseObject;

import java.math.BigDecimal;

public class Item extends BaseObject {
    //Criar a classe Item com os atributos id, descricao, inativo, quantidade em estoque e valor unitário.
    // O atributo quantidade em estoque é obrigatórios;

    private String descricao;
    private Boolean inativo;
    private BigDecimal qtdeEstoque;
    private BigDecimal valorUnitario;

    public Item() {
        inativo = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getInativo() {
        return inativo;
    }

    public void setInativo(Boolean inativo) {
        this.inativo = inativo;
    }

    public BigDecimal getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(BigDecimal qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
