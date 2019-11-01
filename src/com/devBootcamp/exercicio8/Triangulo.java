package com.devBootcamp.exercicio8;

public class Triangulo implements Figura {

    private Double b;
    private Double h;

    public Triangulo(Double b, Double h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public Double getArea() {
        return ( (b*h) /2 );
    }
}
