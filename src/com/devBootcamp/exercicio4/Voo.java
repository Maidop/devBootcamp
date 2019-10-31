package com.devBootcamp.exercicio4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Voo {

    private Integer id;
    private String voo;
    private LocalDateTime dataVoo;
    private Integer maxPassageiros;
    private List<Integer> passageiros = new ArrayList<>();

    public Voo(Integer id, String voo, LocalDateTime dataVoo, Integer maxPassageiros) {
        this.id = id;
        this.voo = voo;
        this.dataVoo = dataVoo;
        this.maxPassageiros = maxPassageiros;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVoo() {
        return voo;
    }

    public void setVoo(String voo) {
        this.voo = voo;
    }

    public LocalDateTime getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(LocalDateTime dataVoo) {
        this.dataVoo = dataVoo;
    }

    public Integer getMaxPassageiros() {
        return maxPassageiros;
    }

    public void setMaxPassageiros(Integer maxPassageiros) {
        this.maxPassageiros = maxPassageiros;
    }

    public List<Integer> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Integer> passageiros) {
        this.passageiros = passageiros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voo voo = (Voo) o;
        return Objects.equals(id, voo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //Primeiro Livre: retorno o número do primeiro assento livre(em ordem crescente)
    public void primeiroLivre(){
        Integer primeiro = 0;
        for (Integer i : passageiros) {
            if (i < primeiro || primeiro == 0) {
                primeiro = i;
            }
        }
        System.out.println("Primeiro acento livre: " + primeiro);
    }

    //Próximo Livre: retorna o número do próximo assento livre em relação ao assento passado por parâmetro
    // (Passar um número de assento e retornar o próximo livre, em ordem crescente)
//    public Integer proximoLivre(Integer atual){
//        Integer orderna = atual;
//        for (Integer i : passageiros) {
//            if(i > atual){
//            }
//        }
//    }

    //Verifica: verifica se o número do assento recebido como parâmetro está ocupado
    public void verificaAcento(Integer valor){
        for (Integer item : passageiros) {
            if(valor == item){
                System.out.println("Acento já ocupado");
                return;
            }
        }
        System.out.println("Acento está livre!");
    }

    //Ocupa: ocupa determinado assento do vôo, cujo número é recebido como parâmetro, e retorna verdadeiro se
    // a cadeira ainda não estiver ocupada (operação foi bem sucedida) e falso caso contrário
    public Boolean ocuparAcento(Integer valor){
        for (Integer item : passageiros) {
            if(item == valor){
                return false;
            }
        }
        return true;
    }

    //Vagas: retorna a quantidade de assentos vagos disponíveis (não ocupados) no vôo
    public void qtdeVagos(){
        Integer quantidade;
        quantidade = maxPassageiros - passageiros.size();
        System.out.println("O vôo possui " + quantidade + " acentos vagos!");
    }

}
