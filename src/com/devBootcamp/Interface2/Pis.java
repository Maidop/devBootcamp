package com.devBootcamp.Interface2;

public class Pis implements Imposto {
    private Double base;

    public Pis(Double base) {
        this.base = base;
    }

    @Override
    public Double calcularImposto() {
        return base * 0.2;
    }
}
