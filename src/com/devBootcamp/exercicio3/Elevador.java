package com.devBootcamp.exercicio3;

public class Elevador {

    private Integer andarAtual = 0;
    private Integer capacidade;
    private Integer qtdePessoas = 0;
    private Integer andares;

    public Elevador(Integer capacidade, Integer andares) {
        this.capacidade = capacidade;
        this.andares = andares;
    }

    public Integer getAndarAtual() {
        return andarAtual;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public Integer getQtdePessoas() {
        return qtdePessoas;
    }

    public Integer getAndares() {
        return andares;
    }

    public void entrar(){
        System.out.println("Chamada de entrar(): ");
        if(qtdePessoas < capacidade){
            qtdePessoas++;
            System.out.println("Há " + qtdePessoas + " pessoas no elevador");
        }else
            System.out.println("Atingido o máximo de pessoas que o elevador suporta!");
    }

    public void sair(){
        System.out.println("Chamada de sair(): ");
        if(qtdePessoas > 0){
            qtdePessoas--;
            System.out.println("Há " + qtdePessoas + " pessoas no elevador");
        }else
            System.out.println("Elevador já se encontra vazio!");
    }

    //Sobe: para subir um andar (não deve subir se já estiver no último andar);
    public void subir(){
        System.out.println("Chamada de subir(): ");
        if(andarAtual < andares){
            andarAtual++;
            System.out.println("Elevador subiu para o andar " +andarAtual);
            if(andarAtual == andares){
                System.out.println("Este  éo último andar");
            }
        }else
            System.out.println("Elevador já se encontra no último andar");
    }

    public void descer(){
        System.out.println("Chamada de descer(): ");
        if(andarAtual > 0){
            andarAtual--;
            System.out.println("Elevador desceu para o andar " +andarAtual);
            if(andarAtual == 0){
                System.out.println("Este  é o andar térreo");
            }
        }else
            System.out.println("Elevador já se encontra no térreo!");
    }
}
