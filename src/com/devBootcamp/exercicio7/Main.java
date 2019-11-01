package com.devBootcamp.exercicio7;

public class Main {
    public static void main(String[] args) {
        GrupoPessoas grupoPessoas = new GrupoPessoas();

        Pessoa p1 = new Pessoa
                ("Antonio", "Fagundes", "12345678945", "fagundesanto@uol.com.br", 47);
        Pessoa p2 = new Pessoa
                ("Eduardo", "Batista", "12345678945", "dudu07@gmail.com", 21);
        Pessoa p3 = new Pessoa
                ("Josias", "Anton", "12345678945", "josias@hotmail.com.br", 12);
        Pessoa p4 = new Pessoa
                ("Carla", "Siqueira", "12345678945", "carla1994@hotmail.com.br", 25);
        Pessoa p5 = new Pessoa
                ("Nazaré", "Soarez", "12345678945", "nazareo@bol.com.br", 16);
        Pessoa p6 = new Pessoa
                ("Matheus", "Castilho", "12345678945", "matheus_castilho@gmail.com", 17);
        Pessoa p7 = new Pessoa
                ("Jonathan", "Ferreira", "12345678945", "jonathan@gmail.com", 18);
        Pessoa p8 = new Pessoa
                ("Indugente", "Teste", "12345678945", "indugente@gmail.com", -1);


        grupoPessoas.adicionaLista(p1);
        grupoPessoas.adicionaLista(p2);
        grupoPessoas.adicionaLista(p3);
        grupoPessoas.adicionaLista(p4);
        grupoPessoas.adicionaLista(p5);
        grupoPessoas.adicionaLista(p6);
        grupoPessoas.adicionaLista(p7);
        grupoPessoas.adicionaLista(p8);

        grupoPessoas.exibeMaiores();
        grupoPessoas.exibeMenores();
    }
}
