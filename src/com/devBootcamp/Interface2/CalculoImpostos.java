package com.devBootcamp.Interface2;

import java.util.List;

public class CalculoImpostos {
    public Double calcularImposto(Imposto imposto){
        return imposto.calcularImposto();
    }

    public Double calcularImposto(List<Imposto> impostos){
        return impostos.stream().mapToDouble(Imposto::calcularImposto).sum();
    }
}
