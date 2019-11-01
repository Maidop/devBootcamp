package com.devBootcamp.Interface2;

public class Cofins implements Imposto {
    private Double base;

    public Cofins(Double base) {
        this.base = base;
    }

    @Override
    public Double calcularImposto() {
        return base * 0.50;
    }
}
