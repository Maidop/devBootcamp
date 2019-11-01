package com.devBootcamp.exercicio9;

public class Aguia implements Animal {
    @Override
    public EspecieAnimal getEspecie() {
        return EspecieAnimal.AVES;
    }

    @Override
    public String getNomeAnimal() {
        return "Águia";
    }
}
