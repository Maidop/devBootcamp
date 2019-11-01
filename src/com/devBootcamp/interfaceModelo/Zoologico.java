package com.devBootcamp.interfaceModelo;

import java.util.List;

public class Zoologico {

    public void caracteristicasAnimais(List<Animal> animais){
        for (Animal animal : animais) {
            caracteristicasAnimais(animal);
        }
    }

    public void caracteristicasAnimais(Animal animal){
        System.out.println("\n" + animal.nomeAnimal());
        System.out.println("Som do animal: " + animal.somDoAnimal());
        System.out.println("Cor do animal: " + animal.corAnimal());
    }
}
