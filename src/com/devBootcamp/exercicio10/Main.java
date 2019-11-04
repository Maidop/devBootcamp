package com.devBootcamp.exercicio10;

import com.devBootcamp.exercicio10.enumeration.FormaPagamento;
import com.devBootcamp.exercicio10.model.*;
import com.devBootcamp.exercicio10.service.ClienteService;
import com.devBootcamp.exercicio10.service.ItemService;
import com.devBootcamp.exercicio10.service.PedidoService;
import com.devBootcamp.exercicio10.service.VendedorService;
import com.devBootcamp.exercicio10.service.impl.ClienteServiceImpl;
import com.devBootcamp.exercicio10.service.impl.ItemServiceImpl;
import com.devBootcamp.exercicio10.service.impl.PedidoServiceImpl;
import com.devBootcamp.exercicio10.service.impl.VendedorServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ClienteService clienteService = new ClienteServiceImpl();
        VendedorService vendedorService = new VendedorServiceImpl();
        ItemService itemService = new ItemServiceImpl();
        PedidoService pedidoService = new PedidoServiceImpl();


        Cliente cliente = new Cliente();
        cliente.setNome("Maikon");
        cliente.setEmail("maikon@maikon.com");
        try {
            cliente = clienteService.save(cliente);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Rafael");
        vendedor.setComissao(5D);
        vendedor.setMaxDesconto(10D);
        try {
            vendedor = vendedorService.save(vendedor);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }


        Item i1 = new Item();
        i1.setDescricao("Camisa");
        i1.setQtdeEstoque(BigDecimal.valueOf(5));
        i1.setValorUnitario(BigDecimal.valueOf(33.50));

        Item i2 = new Item();
        i2.setDescricao("Tenis");
        i2.setQtdeEstoque(BigDecimal.valueOf(2));
        i2.setValorUnitario(BigDecimal.valueOf(350.80));

        Item i3 = new Item();
        i3.setDescricao("Calça Jeans");
        i3.setQtdeEstoque(BigDecimal.valueOf(6));
        i3.setValorUnitario(BigDecimal.valueOf(120.50));

        Item i4 = new Item();
        i4.setDescricao("Moletom");
        i4.setQtdeEstoque(BigDecimal.valueOf(3));
        i4.setValorUnitario(BigDecimal.valueOf(89.90));

        try {

            i1 = itemService.save(i1);
            i2 = itemService.save(i2);
            i3 = itemService.save(i3);
            i4 = itemService.save(i4);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }


        PedidoItem pi1 = new PedidoItem();
        pi1.setItem(i1);
        pi1.setQtde(BigDecimal.valueOf(3));
        pi1.setValorUnitario(i1.getValorUnitario());

        PedidoItem pi2 = new PedidoItem();
        pi2.setItem(i2);
        pi2.setQtde(BigDecimal.valueOf(3));
        pi2.setValorUnitario(i2.getValorUnitario());

        PedidoItem pi3 = new PedidoItem();
        pi3.setItem(i3);
        pi3.setQtde(BigDecimal.valueOf(3));
        pi3.setValorUnitario(i3.getValorUnitario());

        PedidoItem pi4 = new PedidoItem();
        pi4.setItem(i4);
        pi4.setQtde(BigDecimal.valueOf(3));
        pi4.setValorUnitario(i4.getValorUnitario());

        List<PedidoItem> pedidoItemList = new ArrayList<>();
        pedidoItemList.add(pi1);
        pedidoItemList.add(pi2);
        pedidoItemList.add(pi3);
        pedidoItemList.add(pi4);

        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setVendedor(vendedor);
        pedido.setDataCadastro(LocalDateTime.now());
        pedido.setDataValidade(LocalDate.now());
        pedido.setEnderecoEntrega("Av Tupi n. 234 Bairro Centro Pato Branco-PR");
        pedido.setObservacao("Casa dos Fundos");
        pedido.setPrevisaoEntrega(LocalDate.now().plusDays(2));
        pedido.setFormaPagamento(FormaPagamento.CREDITO);
        pedido.setItemList(pedidoItemList);
        try {
            pedido = pedidoService.save(pedido);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }


    }
}
