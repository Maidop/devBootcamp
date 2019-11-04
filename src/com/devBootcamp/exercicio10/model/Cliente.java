package com.devBootcamp.exercicio10.model;

import com.devBootcamp.exercicio10.dao.BaseObject;

public class Cliente extends BaseObject {
    //Criar a classe Cliente com os atributos id, nome, cpf, email. O atributo nome é obrigatório
    private String nome;
    private String cpf;
    private String email;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
