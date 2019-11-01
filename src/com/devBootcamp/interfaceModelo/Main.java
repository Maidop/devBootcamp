package com.devBootcamp.interfaceModelo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Gato();
        System.out.println(animal.somDoAnimal());
        System.out.println(animal.corAnimal());

        Zoologico zoo = new Zoologico();

        List<Animal> animais = new ArrayList<>();
        animais.add(new Gato());
        animais.add(new Cachorro());
        animais.add(new Cavalo());

        zoo.caracteristicasAnimais(animais);

    }
}
