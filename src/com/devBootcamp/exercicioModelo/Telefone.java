package com.devBootcamp.exercicioModelo;

public class Telefone {
    private Long id;
    private String telefone;
    private TipoTelefone tipoTelefone;

    public Telefone(Long id, String telefone, TipoTelefone tipoTelefone) {
        this.id = id;
        this.telefone = telefone;
        this.tipoTelefone = tipoTelefone;
    }

    public Telefone() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(TipoTelefone tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }
}
