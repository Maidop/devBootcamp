package com.devBootcamp.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {

    private Integer id;
    private String nome;
    private String cpf;
    private List<Endereco> enderecos = new ArrayList<>();

    public Cliente(Integer id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void adicionaEndereco(Endereco end){
        for (Endereco item : enderecos) {
            if(item.getTipoEndereco().equals(TipoEndereco.ENTREGA)){
                System.out.println("não possível incluir o endereço: ");
                System.out.println("Rua " + end.getRua() + ", " + end.getNumero()
                        + ", Bairro: " + end.getBairro());
                System.out.println("Já existe um endereço de entrega cadastrado!");
                System.out.println();
                return;
            }
        }
        enderecos.add(end);
    }
}
