package com.devBootcamp.ModeloHereditario;

public class Curso {
    private Integer id;
    private String nome;
    private Integer duracao;

    public Curso(Integer id, String nome, Integer duracao) {
        this.id = id;
        this.nome = nome;
        this.duracao = duracao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }
}
