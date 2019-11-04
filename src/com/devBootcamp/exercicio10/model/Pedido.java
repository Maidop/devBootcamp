package com.devBootcamp.exercicio10.model;

import com.devBootcamp.exercicio10.dao.BaseObject;
import com.devBootcamp.exercicio10.enumeration.FormaPagamento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido extends BaseObject {

    private Cliente cliente;
    private Vendedor vendedor;
    private LocalDateTime dataCadastro;
    private LocalDate dataValidade;
    private LocalDate previsaoEntrega;
    private String enderecoEntrega;
    private String observacao;
    private FormaPagamento formaPagamento;
    private List<PedidoItem> itemList = new ArrayList<>();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public LocalDate getPrevisaoEntrega() {
        return previsaoEntrega;
    }

    public void setPrevisaoEntrega(LocalDate previsaoEntrega) {
        this.previsaoEntrega = previsaoEntrega;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public List<PedidoItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<PedidoItem> itemList) {
        this.itemList = itemList;
    }

    //Implementar um método resumo, que deve listar o valor dos principais atributos
    // (cliente, vendedor, produtos, total dos produtos, total do pedido, etc...)
    // da classe pedido, pedido item, item.
    public void resumoPedido(){
        BigDecimal totalPedido = BigDecimal.valueOf(0);

        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("Vendedor: " + getVendedor().getNome());
        System.out.println("Data do Pedido: " + dataCadastro);
        System.out.println("Previsão de Entrega: " + previsaoEntrega);
        System.out.println("Endereço de Entrega: " + enderecoEntrega);
        System.out.println("Observação: " + observacao);
        for (PedidoItem item : itemList) {
            System.out.println("Produto: " + item.getItem().getDescricao()
                    + " | Quantidade: " + item.getQtde() + " | Total: " + item.getValorTotal());
            totalPedido = totalPedido.add(item.getValorTotal());
        }
        System.out.println("Total Pedido: " + totalPedido);
        System.out.println("Forma de Pagamento: " + getFormaPagamento().getLabel());
    }
}
