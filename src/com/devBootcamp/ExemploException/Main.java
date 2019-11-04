package com.devBootcamp.ExemploException;

public class Main {
    public static void main(String[] args) {

        ValidaPessoa valida = new ValidaPessoa();
        Pessoa p1 = new Pessoa();

        try {
            valida.validarPessoa(p1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
