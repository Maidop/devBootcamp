package com.devBootcamp.ModeloHereditario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private List<AlunoCurso> cursoList = new ArrayList<>();

    public List<AlunoCurso> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<AlunoCurso> cursoList) {
        this.cursoList = cursoList;
    }

    public Integer matricularAluno(Curso curso){
        for (AlunoCurso alunoCurso : cursoList) {
            if(alunoCurso.getCurso().getId().equals(curso.getId())){
                System.out.println("Aluno já cadastrado no curso " + curso.getNome());
                return alunoCurso.getMatricula();
            }
        }
        AlunoCurso alunoCurso = new AlunoCurso(curso, LocalDate.now());
        cursoList.add(alunoCurso);
        return alunoCurso.getMatricula();
    }

}
