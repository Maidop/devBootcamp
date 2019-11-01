package com.devBootcamp.exercicio9;

import java.util.ArrayList;
import java.util.List;

public class EspecieImpl implements EspeciesUtil {

    @Override
    public List<Animal> filtraEspecie(List<Animal> animais, EspecieAnimal especieFiltrar) {
        List<Animal> especie = new ArrayList<>();
        for (Animal animal : animais) {
            if(animal.getEspecie().getLabel().equals(especieFiltrar.getLabel())){
                especie.add(animal);
            }
        }
        return especie;
    }

    @Override
    public List<EspecieAnimal> classificaEspecies(List<Animal> animais) {
        List<EspecieAnimal> especies = new ArrayList<>();
        for (Animal animal : animais) {
            if(!especies.contains(animal.getEspecie())){
                especies.add(animal.getEspecie());
            }
        }
        return  especies;
    }
}
