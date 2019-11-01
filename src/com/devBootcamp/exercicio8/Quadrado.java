package com.devBootcamp.exercicio8;

public class Quadrado implements Figura {

    private Double lado;

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double getArea() {
        return lado * lado;
    }
}
