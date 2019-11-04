package com.devBootcamp.exercicio10.service.impl;

import com.devBootcamp.exercicio10.model.Pedido;
import com.devBootcamp.exercicio10.model.PedidoItem;
import com.devBootcamp.exercicio10.service.PedidoService;

import java.math.BigDecimal;

public class PedidoServiceImpl extends CrudServiceImpl<Pedido> implements PedidoService {
    //cliente, vendedor e data de cadastro


    @Override
    protected void preSave(Pedido entity) {
        if(entity.getCliente() == null){
            throw new RuntimeException("Cliente não informado!");
        }
        if(entity.getVendedor() == null){
            throw new RuntimeException("Vendedor não informado!");
        }
        if(entity.getDataCadastro() == null){
            throw new RuntimeException("Data de cadastro do pedido não informada!");
        }
        BigDecimal comDesconto = BigDecimal.valueOf(0);
        BigDecimal semDesconto = BigDecimal.valueOf(0);
        for (PedidoItem item : entity.getItemList()) {
            if(item.getValorUnitario().compareTo(BigDecimal.ZERO) <= 0){
                throw new RuntimeException("Valor unitário do item " + item.getItem().getDescricao() + " Não pode ser zero");
            }
            if(item.getItem().getInativo() == true){
                throw new RuntimeException("Não possível adicionar item " + item.getItem().getDescricao() + " poise está inativo!");
            }
            if(item.getQtde().compareTo(item.getItem().getQtdeEstoque()) > 0){
                throw new RuntimeException("Não possível vender item " + item.getItem().getDescricao() + " pois a quantidade solicitada" +
                        " é maior que a quantidade em estoque!");
            }
            comDesconto = comDesconto.add(item.getValorTotal());
            semDesconto = semDesconto.add(item.getTotalSemDesconto());
        }

        BigDecimal totalDesconto;
        totalDesconto = semDesconto.subtract(semDesconto
                .divide(BigDecimal.valueOf(100)).multiply(BigDecimal.valueOf(entity.getVendedor().getComissao())));

        if(totalDesconto.compareTo(comDesconto)){

        }
    }

    @Override
    protected void postSave(Pedido entity) {
        super.postSave(entity);
    }
}
