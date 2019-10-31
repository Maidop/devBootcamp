package com.devBootcamp.exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empregado {

    private Double ajudaCusto;
    private Double comissaoGerente;
    private List<Vendedor> vendedores = new ArrayList<>();

    public Gerente(String nome, String cpf, Double salario, Double imposto, Double ajudaCusto, Double comissaoGerente) {
        super(nome, cpf, salario, imposto);
        this.ajudaCusto = ajudaCusto;
        this.comissaoGerente = comissaoGerente;
    }

    public Double getAjudaCusto() {
        return ajudaCusto;
    }

    public void setAjudaCusto(Double ajudaCusto) {
        this.ajudaCusto = ajudaCusto;
    }

    public Double getComissaoGerente() {
        return comissaoGerente;
    }

    public void setComissaoGerente(Double comissaoGerente) {
        this.comissaoGerente = comissaoGerente;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    @Override
    public void calculaSalario() {
        Double pagamento;
        Double comissaoVendas;
        Double bruto;
        Double vendas = 0D;
        for (Vendedor item : vendedores) {
            vendas += item.getProdutosVendidos();
        }
        comissaoVendas = ( (vendas/100) * comissaoGerente);
        bruto = super.getSalario() + ajudaCusto + comissaoVendas;
        pagamento = bruto - ( (bruto/100) * super.getImposto());

        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + super.getCpf() + "\n");
        System.out.println("Salário base: " + super.getSalario());
        System.out.println("Ajuda de custo: " + ajudaCusto);
        System.out.println("Total de vendas: " + vendas);
        System.out.println("Total de comissão: " + comissaoVendas + "\n");
        System.out.println("Salário calculado do vendedor: " + pagamento);
    }
}
