package com.devBootcamp.exercicioModelo;

public enum TipoTelefone {

    COMERCIAL("Comercial"),
    RESIDENCIAL("Residencial"),
    CELULAR("Celular");

    private String label;

    TipoTelefone(String label) {

        this.label = label;

    }

    public String getLabel() {

        return label;

    }

}
