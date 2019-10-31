package com.devBootcamp.exercicio6;

public class Vendedor extends Empregado {
    // o atributo valor dos produtos vendidos
    // (que corresponde ao valor monetário dos artigos efetivamente vendidos por ele) e comissão
    // (que corresponde à porcentagem do valor sobre as vendas de produtos que será somado ao valor do salário base
    // do vendedor, o imposto deve ser descontado do total, salário base + comissão). Note que deverá redefinir nesta
    // subclasse o método herdado para calcular o salário. Escreva um programa de teste adequado para esta classe.

    private Double produtosVendidos;
    private Double comissao;

    public Vendedor(String nome, String cpf, Double salario, Double imposto, Double produtosVendidos, Double comissao) {
        super(nome, cpf, salario, imposto);
        this.produtosVendidos = produtosVendidos;
        this.comissao = comissao;
    }

    public Double getProdutosVendidos() {
        return produtosVendidos;
    }

    public void setProdutosVendidos(Double produtosVendidos) {
        this.produtosVendidos = produtosVendidos;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    @Override
    public void calculaSalario() {
        Double pagamento;
        Double base = super.getSalario();
        Double comissaoVendas = (produtosVendidos/100*comissao);
        Double imposto = ((comissaoVendas + base) / 100) * getImposto();

        pagamento = (base + comissaoVendas) - imposto;
        System.out.println("Nome: " + super.getNome());
        System.out.println("CPF: " + super.getCpf() + "\n");
        System.out.println("Salário base: " + super.getSalario());
        System.out.println("Total de vendas: " + produtosVendidos);
        System.out.println("Total de comissão: " + comissaoVendas + "\n");
        System.out.println("Salário calculado do vendedor: " + pagamento);
    }
}
