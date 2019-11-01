package com.devBootcamp.exercicio9;

import java.util.ArrayList;
import java.util.List;

public class ContabilizarEspecies {

    public List<Resultado> contaEspecie(List<Animal> animalList, EspecieImpl especieImpl){

        List<Resultado> dados = new ArrayList<>();
        List<EspecieAnimal> especies = new ArrayList<>();

        especies = especieImpl.classificaEspecies(animalList);


        for (EspecieAnimal especieAnimal : especies) {
            List<Animal> animalEspecie = new ArrayList<>();
            animalEspecie = especieImpl.filtraEspecie(animalList, especieAnimal);
            Integer qtde = 0;

            for (Animal animal : animalEspecie) {
                qtde++;
            }
            dados.add(new Resultado(especieAnimal,qtde));
        }

        return dados;

    }


}
