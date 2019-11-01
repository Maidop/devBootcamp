package com.devBootcamp.exercicio9;

public class Resultado {
    private EspecieAnimal especie;
    private Integer qtde;

    public Resultado(EspecieAnimal especie, Integer qtde) {
        this.especie = especie;
        this.qtde = qtde;
    }

    public EspecieAnimal getEspecie() {
        return especie;
    }

    public void setEspecie(EspecieAnimal especie) {
        this.especie = especie;
    }

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }
}
