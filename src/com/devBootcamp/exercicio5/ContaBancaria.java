package com.devBootcamp.exercicio5;

public abstract class ContaBancaria {
    //contém como atributos o número da conta e o saldo, e como métodos abstratos
    // sacar e depositar que recebem um parâmetro do tipo Double

    private Integer id;
    private Integer conta;
    private Double saldo;

    public ContaBancaria(Integer id, Integer conta, Double saldo) {
        this.id = id;
        this.conta = conta;
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    protected abstract void sacar(Double valor);
    protected abstract void depositar(Double valor);


}
