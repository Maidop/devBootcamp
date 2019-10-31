package com.devBootcamp.ModeloHereditario;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maikon");
        pessoa.setCpf("11122233344");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Arthur");
        funcionario.setCpf("55544466677");
        funcionario.setDataAdminissao(LocalDate.now().minusYears(1));
        funcionario.setSalario(BigDecimal.valueOf(1000));

        System.out.println("Funcionário: ");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Admissão: " + funcionario.getDataAdminissao());
        System.out.println("Salário: " + funcionario.calculaSalario() + "R$");

        Aluno aluno = new Aluno();
        aluno.setNome("Aluninho");
        aluno.setCpf("654646846546");

        Curso ads = new Curso(1, "ADS", 4);
        Integer ads1 = aluno.matricularAluno(ads);
        System.out.println(ads1);

        Curso adm = new Curso(2, "ADM", 4);
        Integer adm1 = aluno.matricularAluno(adm);
        System.out.println(adm1);

        Integer mat11 = aluno.matricularAluno(new Curso(2, "ADM", 4));
        System.out.println(mat11);

        System.out.println("Aluno matriculado em:");
        for (AlunoCurso alunoCurso : aluno.getCursoList()) {
            System.out.println(alunoCurso.getCurso().getNome());
            System.out.println(alunoCurso.getMatricula());
            System.out.println(alunoCurso.getCurso().getDuracao());
        }

        Professor professor = new Professor();
        professor.setNome("Profeeee");
        professor.setCpf("44455566611");
        professor.setDataAdminissao(LocalDate.now().minusYears(1));
        professor.setSalario(BigDecimal.valueOf(4000));

        ProfessorCurso professorCurso = new ProfessorCurso();
        professorCurso.setCurso(ads);
        professorCurso.setPercentual(10D);
        professor.getProfessorCursoList().add(professorCurso);

        System.out.println("Professor: ");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("CPF: " + professor.getCpf());
        System.out.println("Admissão: " + professor.getDataAdminissao());
        System.out.println("Salário: " + professor.calculaSalario());
        System.out.println("Cursos: ");
        for (ProfessorCurso curso : professor.getProfessorCursoList()) {
            System.out.println("Curso: " + professorCurso.getCurso().getNome());
            System.out.println("Percentual sobre o curso: " + professorCurso.getPercentual());
            System.out.println();
        }

    }
}
