package com.devBootcamp.exercicio9;

public enum EspecieAnimal {

    AVES("Aves"),
    MAMIFEROS("Mamiferos"),
    PEIXES("Peixes"),
    REPTEIS("Repteis");

    private String label;

    EspecieAnimal(String label) {

        this.label = label;

    }

    public String getLabel() {

        return label;

    }
}
