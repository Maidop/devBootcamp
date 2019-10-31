package com.devBootcamp.exercicio6;

public class Empregado extends Pessoa {

    private Double salario;
    private Double imposto;

    public Empregado(String nome, String cpf, Double salario, Double imposto) {
        super(nome, cpf);
        this.salario = salario;
        this.imposto = imposto;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public void calculaSalario(){
        Double pagamento;
        pagamento = salario - ((salario/100) * imposto);
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + super.getCpf() + "\n");
        System.out.println("Salário base: " + salario);
        System.out.println("Salário calculado com desconto de impostos: " + pagamento);
    }

}
