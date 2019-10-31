package com.devBootcamp.exercicio5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1, 1234, 1500D,15D);

        contaCorrente.sacar(200D);
        contaCorrente.sacar(1500D);
        contaCorrente.depositar(250D);
        contaCorrente.depositar(2000D);

        ContaPoupanca contaPoupanca = new ContaPoupanca(2,3214,2000D,500D);
        contaPoupanca.sacar(2600D);
        contaPoupanca.sacar(150D);
        contaPoupanca.depositar(600D);

    }
}
