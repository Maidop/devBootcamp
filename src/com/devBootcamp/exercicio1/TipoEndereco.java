package com.devBootcamp.exercicio1;

public enum TipoEndereco {

    COBRANCA("Cobrança"),
    ENTREGA("Entrega"),
    RESIDENCIAL("Residencial");

    private String label;

    TipoEndereco(String label) {

        this.label = label;

    }

    public String getLabel() {

        return label;

    }

}
