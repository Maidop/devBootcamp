package com.devBootcamp.exercicio9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EspecieImpl especieImpl = new EspecieImpl();
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Gato());
        animais.add(new Aguia());
        animais.add(new Aguia());
        animais.add(new Aguia());
        animais.add(new Lambari());
        animais.add(new Lambari());
        animais.add(new Jacare());
        animais.add(new Jacare());
        animais.add(new Jacare());
        animais.add(new Jacare());

        //4 mamiferos - 3 aves - 2 peixes - 4 repteis

        ContabilizarEspecies contabilizarEspecies = new ContabilizarEspecies();

        List<Resultado> qtdeEspecies = new ArrayList<>();
        qtdeEspecies = contabilizarEspecies.contaEspecie(animais,especieImpl);

        System.out.println("Lista de quantidade de Animais por espécie");
        for (Resultado qtdes : qtdeEspecies) {
            System.out.println("Especie " + qtdes.getEspecie().getLabel() + " possui " + qtdes.getQtde()
                            + " animais na lista!\n");
        }

    }
}
