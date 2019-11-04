package com.devBootcamp.exercicio10.enumeration;

public enum FormaPagamento {

    DINHEIRO("Dinheiro"),
    CREDITO("Cartão de Crédito"),
    DEBITO("Cartão de Débito"),
    BOLETO("Boleto");

    private String label;

    FormaPagamento(String label) {

        this.label = label;

    }

    public String getLabel() {

        return label;

    }
}
