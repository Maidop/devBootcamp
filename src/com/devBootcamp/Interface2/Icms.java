package com.devBootcamp.Interface2;

public class Icms implements Imposto {

    private Double base;

    public Icms(Double base) {
        this.base = base;
    }

    @Override
    public Double calcularImposto() {
        return base * 0.10;
    }
}
