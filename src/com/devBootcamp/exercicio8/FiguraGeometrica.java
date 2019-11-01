package com.devBootcamp.exercicio8;

import java.util.List;

public class FiguraGeometrica {
    public Double calcularArea(Figura figura){
        return figura.getArea();
    }

    public void calcularArea(List<Figura> figuras){
        for (Figura figura : figuras) {
            System.out.println("Área da figura: " + figura.getArea());
        }
    }
}
