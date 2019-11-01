package com.devBootcamp.exercicio8;

public class Retangulo implements Figura {

    private Double l1;
    private Double l2;

    public Retangulo(Double l1, Double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    public Double getArea() {
        return l1 * l2;
    }
}
