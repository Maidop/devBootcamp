package com.devBootcamp.exercicio6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Empregado!");
        Empregado empregado = new Empregado("Josias", "12345678912", 1500D, 8D);
        empregado.calculaSalario();

        System.out.println();
        System.out.println("Vendedor!");
        Vendedor vendedor = new Vendedor
                ("Fernando", "12345678978", 800D, 8D, 1500D, 15D);
        vendedor.calculaSalario();

        System.out.println();
        Vendedor vendedor2 = new Vendedor
                ("Rafael", "12345678978", 1000D, 8D, 2500D, 16D);

        System.out.println();
        System.out.println("Gerente!");

        Gerente gerente = new Gerente
                ("Andréia", "78945632154", 5000D, 10D, 2500D, 10D);
        gerente.getVendedores().add(vendedor);
        gerente.getVendedores().add(vendedor2);
        gerente.calculaSalario();
    }
}
