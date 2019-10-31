package com.devBootcamp.exercicio5;

public class ContaPoupanca extends ContaBancaria {

    private Double limiteCredito;

    public ContaPoupanca(Integer id, Integer conta, Double saldo, Double limiteCredito) {
        super(id, conta, saldo);
        this.limiteCredito = limiteCredito;
    }

    public ContaPoupanca(Double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public ContaPoupanca() {
    }

    public Double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(Double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    protected void sacar(Double valor) {
        Double saldoAtual = super.getSaldo();
        if(saldoAtual <= 0){
            if (valor > (saldoAtual - limiteCredito)*(-1)){
                System.out.println("Operação inválida! Saldo insuficiente!");
            }
        }else if(valor > (saldoAtual + limiteCredito)){
            System.out.println("Operação inválida! Saldo insuficiente!");
        }
        else{
            saldoAtual -= valor;
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo atual: " + saldoAtual);
            super.setSaldo(saldoAtual);
        }
    }

    @Override
    protected void depositar(Double valor) {
        Double saldoAtual = super.getSaldo();
        saldoAtual += valor;
        System.out.println("Deposito efetuado com sucesso!");
        System.out.println("Saldo atual: " + super.getSaldo());
    }
}
