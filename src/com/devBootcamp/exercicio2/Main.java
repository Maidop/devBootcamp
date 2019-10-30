package com.devBootcamp.exercicio2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Av. Tupy");
        endereco.setNumero("1024");
        endereco.setBairro("Centro");

        Proprietario dono = new Proprietario("Maikon", "05270331977", "5640001");
        dono.setEndereco(endereco);
        dono.setDataNascimento(LocalDate.of(1994,01,06));

        Carro carro = new Carro(10D,dono);
        carro.setModelo("Uno com escada!");
        carro.setCor("Vinho");
        carro.setAno("1996");
        carro.setMarca("Fiat");
        carro.setChassi("6584354976");
        carro.setVelocidadeMaxima(180D);
        carro.setVelocidadeAtual(50D);
        carro.setNrMarcha(5);

        System.out.println("Velocidade inicial: " + carro.getVelocidadeAtual());

        carro.acelera();
        carro.trocaMarcha();
        carro.trocaMarcha();
        carro.reduzMarcha();
        carro.freia();
        carro.acelera();
        carro.acelera();
        carro.acelera();
        carro.acelera();
        carro.acelera();
        carro.acelera();
        carro.marchaRe();
        carro.freia();
        carro.marchaRe();

        carro.calculaAutonomia(15D);

    }
}
