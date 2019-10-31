package com.devBootcamp.ModeloHereditario;

import java.time.LocalDate;
import java.util.Random;

public class AlunoCurso {
    private Integer matricula;
    private Curso curso;
    private LocalDate dataDeInicio;

    public AlunoCurso(Curso curso, LocalDate dataDeInicio) {
        this.matricula = new Random().nextInt();
        this.curso = curso;
        this.dataDeInicio = dataDeInicio;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public LocalDate getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(LocalDate dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }
}
