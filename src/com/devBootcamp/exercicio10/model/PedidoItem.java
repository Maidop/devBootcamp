package com.devBootcamp.exercicio10.model;

import com.devBootcamp.exercicio10.dao.BaseObject;

import java.math.BigDecimal;

public class PedidoItem extends BaseObject {

    private Pedido pedido;
    private Item item;
    private BigDecimal qtde;
    private BigDecimal valorUnitario;
    private BigDecimal valorDesconto;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public BigDecimal getQtde() {
        return qtde;
    }

    public void setQtde(BigDecimal qtde) {
        this.qtde = qtde;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public BigDecimal getValorTotal(){

        return (getQtde().multiply(getValorUnitario()).subtract(getValorDesconto()));
    }

    public BigDecimal getTotalSemDesconto(){

        return (getQtde().multiply(getValorUnitario()));
    }

}
