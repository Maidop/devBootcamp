package com.devBootcamp.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "Maikon", "05270331977");
        cliente.getEnderecos().add(new Endereco(1, "José Fraron", "1500", "Fraron", TipoEndereco.COBRANCA));
        cliente.getEnderecos().add(new Endereco(2, "José Tatto", "338", "Fraron", TipoEndereco.ENTREGA));

        Produto p1 = new Produto(1, "Café", 15.0, 1.50);
        Produto p2 = new Produto(2, "Chocolate", 12.0, 2.50);
        Produto p3 = new Produto(3, "Bala", 25.0, 0.10);

        NotaFiscal nf = new NotaFiscal(1, "12345", cliente);

        nf.getNotaFiscalItem().add(new NotaFiscalItem(1, nf, p1, 2.0, 1.50));
        nf.getNotaFiscalItem().add(new NotaFiscalItem(2, nf, p2, 1.0, 2.50));
        nf.getNotaFiscalItem().add(new NotaFiscalItem(3, nf, p3, 10.0, 0.10));

        nf.exibeNota();
    }
}
