package com.devBootcamp.exercicio7;

import java.util.ArrayList;
import java.util.List;

public class GrupoPessoas {
    //Crie uma classe chamada Grupo de Pessoas e adicione dois atributo do tipo List para adicionar pessoas,
    // uma para maiores e outra para menores de idade. Não deve ser adicionado na lista para maiores pessoas menores d
    // e 18 anos, bem como na lista de menores não deve ser possível adicionar maiores de 18 anos. Criar métodos para
    // retornar e apresentar às pessoas com maior e menor idade que foram adicionadas nas em ambas listas. Implemente
    // uma classe para testar as informações.

    private List<Pessoa> maiores = new ArrayList<>();
    private List<Pessoa> menores = new ArrayList<>();

    public GrupoPessoas() {
    }

    public List<Pessoa> getMaiores() {
        return maiores;
    }

    public List<Pessoa> getMenores() {
        return menores;
    }

    public void adicionaLista(Pessoa pessoa){
        if(pessoa.getIdade() >= 18){ //Estou considerando que com 18 anos também irá para a lista de maiores
            maiores.add(pessoa);
        }else if(pessoa.getIdade() < 18 && pessoa.getIdade() >=0){
            menores.add(pessoa);
        }else{
            System.out.println("Idade inválida!");
        }
    }

    public void exibeMaiores(){
        System.out.println();
        System.out.println("Pessoas com 18 anos ou mais!");
        //ome, sobrenome, cpf, email, idade
        for (Pessoa item : maiores) {
            System.out.println("Nome Completo: " + item.getNome() + " " + item.getSobrenome());
            System.out.println("CPF: " + item.getCpf());
            System.out.println("e-mail: " + item.getEmail());
            System.out.println("Idade: " + item.getIdade() + "\n");
        }
        System.out.println();
    }

    public void exibeMenores(){
        System.out.println();
        System.out.println("Pessoas menores de 18 anos!");
        //ome, sobrenome, cpf, email, idade
        for (Pessoa item : menores) {
            System.out.println("Nome Completo: " + item.getNome() + " " + item.getSobrenome());
            System.out.println("CPF: " + item.getCpf());
            System.out.println("e-mail: " + item.getEmail());
            System.out.println("Idade: " + item.getIdade() + "\n");
        }
        System.out.println();
    }
}
