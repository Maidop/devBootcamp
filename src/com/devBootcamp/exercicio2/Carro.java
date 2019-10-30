package com.devBootcamp.exercicio2;

public class Carro {

    private String modelo;
    private String cor;
    private String ano;
    private String marca;
    private String chassi;
    private Proprietario proprietario;
    private Double velocidadeMaxima;
    private Double velocidadeAtual;
    private Integer nrMarcha;
    private Integer marchaAtual = 1;
    private Double qtdeCombustivel;

    public Carro(Double qtdeCombustivel, Proprietario proprietario) {
        this.qtdeCombustivel = qtdeCombustivel;
        this.proprietario = proprietario;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Integer getNrMarcha() {
        return nrMarcha;
    }

    public void setNrMarcha(Integer nrMarcha) {
        this.nrMarcha = nrMarcha;
    }

    public Double getQtdeCombustivel() {
        return qtdeCombustivel;
    }

    //Implemente o método acelera que aumenta a velocidade de 1 em 1 km/h(Não pode exceder a velocidade máxima)
    public void acelera(){
        if(velocidadeAtual <= velocidadeMaxima){
            velocidadeAtual += 1;
            System.out.println("velocidade atual = " + velocidadeAtual + "Km/h");
        }else{
            System.out.println("O carro já atingiu a velocidade máxima");
        }
    }

    //Implemente o método freia que para o carro – Velocidade = 0 km/h
    public void freia(){
        velocidadeAtual = 0.0;
        System.out.println("velocidade atual = " + velocidadeAtual + "Km/h");
    }

    //Implemete o método troca marcha(Não pode passar do número máximo);
    public void trocaMarcha(){
        if(marchaAtual < nrMarcha){
            marchaAtual++;
            System.out.println("Marcha atual = " + marchaAtual);
        }else
            System.out.println("Marcha atual já é a ultima marcha");
    }

    //Implemente o método reduz a marcha(Não pode passar do número mínimo);
    public void reduzMarcha(){
        if(marchaAtual > 1){
            marchaAtual--;
            System.out.println("Marcha atual = " + marchaAtual);
        }
    }

    //A marcha ré(pode usar o valor 0) não pode ser engatada se  a velocidade for superior a 0 KM/h;
    public void marchaRe(){
        if(velocidadeAtual > 0){
            System.out.println("Carro em movimento, necessário primeiro freiar o carro!");
        }else{
            marchaAtual = 0;
        }
    }

    //Implemente um método que calcule a autonomia de viagem do veículo com base no consumo médio
    // passado como parâmetro(consumo médio multiplicado pela quantidade de litros de combustível);
    public void calculaAutonomia(Double media){
        System.out.println("Autonomia média de " + media * qtdeCombustivel + " Km/h");
    }
}
