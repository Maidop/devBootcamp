package com.devBootcamp.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NotaFiscal {

    private Integer id;
    private String numeroNota;
    private Cliente cliente;
    private Endereco enderecoEntrega;
    private List<NotaFiscalItem> notaFiscalItem = new ArrayList<>();
    private Double total = 0.0;

    public NotaFiscal(Integer id, String numeroNota, Cliente cliente) {
        this.id = id;
        this.numeroNota = numeroNota;
        this.cliente = cliente;
        definirEndereco();
    }

    public NotaFiscal(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(String numeroNota) {
        this.numeroNota = numeroNota;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void definirEndereco(){
        for (Endereco endereco : cliente.getEnderecos()) {
            if(endereco.getTipoEndereco().equals(TipoEndereco.ENTREGA)){
                enderecoEntrega = endereco;
                return;
            }
        }
        System.out.println("Nenhum endereço de entrega encontrado!");
    }

    public List<NotaFiscalItem> getNotaFiscalItem() {
        return notaFiscalItem;
    }

    public void setNotaFiscalItem(List<NotaFiscalItem> notaFiscalItem) {
        this.notaFiscalItem = notaFiscalItem;
    }

    public Double getTotal() {
        for (NotaFiscalItem item : notaFiscalItem) {
            total += item.getValorTotal();
        }
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotaFiscal that = (NotaFiscal) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void exibeNota(){
        System.out.println("Numero Nota: " + numeroNota);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Endereço de Entrega:");
        System.out.println("Rua " + enderecoEntrega.getRua() + ", Numero: " + enderecoEntrega.getNumero()
            + ", Bairro: " + enderecoEntrega.getBairro());
        for (NotaFiscalItem fI : notaFiscalItem) {
            System.out.println(fI.getProduto().getDescricao() + " | " + fI.getValorUnitario() + " | "
                                + fI.getQtde() + " | " + fI.getValorTotal());
        }
        System.out.println("Total da compra: " + this.getTotal());
    }

}
