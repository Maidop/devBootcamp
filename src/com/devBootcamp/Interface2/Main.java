package com.devBootcamp.Interface2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CalculoImpostos calculoImpostos = new CalculoImpostos();

        Double valorBaseCalculo = 100D;
        var icms = new Icms(valorBaseCalculo);
        var pis = new Pis(valorBaseCalculo);
        var cofins = new Cofins(valorBaseCalculo);
        var ipi = new Ipi(valorBaseCalculo);



//        Double valorICMS = calculoImpostos.calcularImposto(new Icms(valorBaseCalculo));
//        Double valorPis = calculoImpostos.calcularImposto(new Pis(valorBaseCalculo));
//        Double valorCofins = calculoImpostos.calcularImposto(new Cofins(valorBaseCalculo));
//        Double valorIpi = calculoImpostos.calcularImposto(new Ipi(valorBaseCalculo));

        Double valorICMS = calculoImpostos.calcularImposto(icms);
        Double valorPis = calculoImpostos.calcularImposto(pis);
        Double valorCofins = calculoImpostos.calcularImposto(cofins);
        Double valorIpi = calculoImpostos.calcularImposto(ipi);

        List<Imposto> impostos = new ArrayList<>();
        impostos.add(icms);
        impostos.add(pis);
        impostos.add(cofins);
        impostos.add(ipi);

        var totalImpostos = calculoImpostos.calcularImposto(impostos);

        System.out.println("Valor ICMS: " + valorICMS);
        System.out.println("Valor PIS: " + valorPis);
        System.out.println("Valor COFINS: " + valorCofins);
        System.out.println("Valor IPI: " + valorIpi);
        System.out.println("Valor Total de Impostos: " + totalImpostos);

    }
}
