package com.devBootcamp.ModeloHereditario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {
    private List<ProfessorCurso> professorCursoList = new ArrayList<>();

    public List<ProfessorCurso> getProfessorCursoList() {
        return professorCursoList;
    }

    public void setProfessorCursoList(List<ProfessorCurso> professorCursoList) {
        this.professorCursoList = professorCursoList;
    }

    @Override
    public BigDecimal calculaSalario() {
        BigDecimal base = super.calculaSalario();
        Double totalPercentual = 0D;
        for (ProfessorCurso professorCurso : professorCursoList) {
            totalPercentual += professorCurso.getPercentual();
        }
        return base.add(
                base.multiply(BigDecimal.valueOf(totalPercentual))
                .divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP)
        );
    }
}
