package com.devBootcamp.exercicio10.model;

import com.devBootcamp.exercicio10.dao.BaseObject;

public class Email {
    //Criar a classe Email com os atributos de, para, título e conteúdo. Os atributos de e para são obrigatório;

    private String de;
    private String para;
    private String titulo;
    private String conteudo;

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
