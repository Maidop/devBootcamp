package com.devBootcamp.interfaceModelo;

public class Cavalo implements Animal {
    @Override
    public String somDoAnimal() {
        return "IRRRIIIN";
    }

    @Override
    public String nomeAnimal() {
        return "Cavalo";
    }

    @Override
    public String corAnimal() {
        return "Branco";
    }
}
