package com.devBootcamp.exercicio8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Figura quadrado = new Quadrado(2.5);
        Figura retangulo = new Retangulo(2.5, 4.2);
        Figura triangulo = new Triangulo(3D, 5D);
        Figura circulo = new Circulo(2.5);

        FiguraGeometrica figuraGeometrica = new FiguraGeometrica();

        List<Figura> figuras = List.of(quadrado, retangulo, triangulo, circulo);

        System.out.println("Área do quadrado: " + figuraGeometrica.calcularArea(quadrado));
        System.out.println("Área do Retangulo: " + figuraGeometrica.calcularArea(retangulo));
        System.out.println("Área do Triangulo: " + figuraGeometrica.calcularArea(triangulo));
        System.out.println("Área do Circulo: " + figuraGeometrica.calcularArea(circulo));

        System.out.println("\n\nLista!");
        figuraGeometrica.calcularArea(figuras);

    }
}
