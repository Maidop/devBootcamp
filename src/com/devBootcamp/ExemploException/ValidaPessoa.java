package com.devBootcamp.ExemploException;

public class ValidaPessoa {
    public void validarPessoa(Pessoa pessoa) throws Exception{
        if(pessoa.getCpf() == null || pessoa.getCpf().length() < 11){
            throw new Exception("Caracteres insuficientes para CPF!");
        }
    }
}
