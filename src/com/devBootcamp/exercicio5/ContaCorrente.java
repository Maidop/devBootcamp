package com.devBootcamp.exercicio5;

public class ContaCorrente extends ContaBancaria {

    private Double taxaOperacao;

    public ContaCorrente(Integer id, Integer conta, Double saldo, Double taxaOperacao) {
        super(id, conta, saldo);
        this.taxaOperacao = taxaOperacao;
    }

    public ContaCorrente(Double taxaOperacao) {
        this.taxaOperacao = taxaOperacao;
    }

    public ContaCorrente() {
    }

    public Double getTaxaOperacao() {
        return taxaOperacao;
    }

    public void setTaxaOperacao(Double taxaOperacao) {
        this.taxaOperacao = taxaOperacao;
    }

    @Override
    protected void sacar(Double valor) {
        Double saldoAtual = super.getSaldo();
        if (valor < saldoAtual){
            if((saldoAtual + valor + ((saldoAtual/100)*taxaOperacao))< 0){
                System.out.println("Operação não realizada, saldo insuficiente para saque");
                return;
            }else{
                saldoAtual = saldoAtual - valor - ((saldoAtual/100)*taxaOperacao);
                System.out.println("Saque efetuado com sucesso!");
                System.out.println("Saldo atual: " + saldoAtual);
                super.setSaldo(saldoAtual);
                return;
            }
        }else{
            System.out.println("Operação não realizada, o saldo em conta é menor que o valor que deseja sacar");
            System.out.println("Saldo atual: " + super.getSaldo());
        }
    }

    @Override
    protected void depositar(Double valor) {
        Double saldoAtual = super.getSaldo();
        if(taxaOperacao >= 100){
            System.out.println("Operação não realizada! Algo está errado com sua taxa de operação, converse com seu gerente!");
            return;
        }

        saldoAtual = saldoAtual + valor - ((saldoAtual/100)*taxaOperacao);
        System.out.println("Deposito efetuado com sucesso!");
        System.out.println("Saldo atual: " + saldoAtual);
        super.setSaldo(saldoAtual);
    }
}
