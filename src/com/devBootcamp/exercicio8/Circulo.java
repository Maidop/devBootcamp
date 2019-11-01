package com.devBootcamp.exercicio8;

public class Circulo implements Figura {

    private Double r;

    public Circulo(Double r) {
        this.r = r;
    }

    @Override
    public Double getArea() {
        return Math.PI * Math.pow(r,2);
    }
}
