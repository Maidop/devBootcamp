package com.devBootcamp.interfaceModelo;

public class Gato implements Animal {

    @Override
    public String somDoAnimal() {
        return "MIAU";
    }

    @Override
    public String nomeAnimal() {
        return "Gato";
    }

    @Override
    public String corAnimal() {
        return "Preto";
    }
}
