package com.devBootcamp.interfaceModelo;

public class Cachorro implements Animal {
    @Override
    public String somDoAnimal() {
        return "AUAU";
    }

    @Override
    public String nomeAnimal() {
        return "Cachorro";
    }

    @Override
    public String corAnimal() {
        return "Caramelo!";
    }
}
