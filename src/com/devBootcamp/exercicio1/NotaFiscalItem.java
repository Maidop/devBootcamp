package com.devBootcamp.exercicio1;

import java.util.Objects;

public class NotaFiscalItem {

    private Integer id;
    private NotaFiscal notaFiscal;
    private Produto produto;
    private Double qtde;
    private Double valorUnitario;

    public NotaFiscalItem(Integer id, NotaFiscal notaFiscal, Produto produto, Double qtde, Double valorUnitario) {
        this.id = id;
        this.notaFiscal = notaFiscal;
        this.produto = produto;
        this.qtde = qtde;
        this.valorUnitario = valorUnitario;
    }

    public Integer getId() {
        return id;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getQtde() {
        return qtde;
    }

    public void setQtde(Double qtde) {
        this.qtde = qtde;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorTotal() {
        return valorUnitario * qtde;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotaFiscalItem that = (NotaFiscalItem) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
