package com.devBootcamp.exercicioModelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        dadosPessoa();
    }

    public static void dadosPessoa(){
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa = new Pessoa();
        pessoa.setId(1L);
        pessoa.setNome("Maikon");
        pessoa.setSobrenome("Pscheidt");
        pessoa.setCpf("05270331977");
        pessoa.setEmail("maikon.pscheidt@gmail.com");
        pessoa.setDataNascimento(LocalDate.of(1994,01,06));
        pessoa.getEnderecos().add(new Endereco(1L, "José Tatto", 338, "Fraron"));
        pessoa.getTelefones().add(new Telefone(1L,"46991402834",TipoTelefone.CELULAR));

        pessoas.add(pessoa);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setId(2L);
        pessoa2.setNome("Fatima");
        pessoa2.setSobrenome("Paslauski");
        pessoa2.setCpf("78897684915");
        pessoa2.setEmail("fatima.paslauski@gmail.com");
        pessoa2.setDataNascimento(LocalDate.of(1970,04,27));
        pessoa2.getEnderecos().add(new Endereco(2L, "Henrique Santos", 338, "Espigão do Bugre"));
        pessoa2.getTelefones().add(new Telefone(2L,"47991385879",TipoTelefone.CELULAR));
        pessoa2.getTelefones().add(new Telefone(3L,"47991768452",TipoTelefone.CELULAR));

        pessoas.add(pessoa2);

        for (Pessoa pessoax : pessoas) {
            System.out.println("Nome: " + pessoax.getNome() + " " + pessoax.getSobrenome()
                + "\nCPF: " + pessoax.getCpf()
                + "\neMail: " + pessoax.getEmail()
                + "\nData de Nascimento: " + pessoax.getDataNascimento());
            System.out.println("\nEndereços: ");
            pessoax.exibeEnderecos();
            System.out.println("\nTelefones: ");
            pessoax.exibeTelefones();
            System.out.println("\n");
        }

    }
}
