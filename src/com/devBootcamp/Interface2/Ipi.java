package com.devBootcamp.Interface2;

public class Ipi implements Imposto {
    private Double base;

    public Ipi(Double base) {
        this.base = base;
    }

    @Override
    public Double calcularImposto() {
        return base * 0.15;
    }
}
