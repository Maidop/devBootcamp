package com.devBootcamp.modeloDao.pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PessoaDaoImpl implements PessoaDao {

    @Override
    public Pessoa save(Pessoa pessoa) {
        pessoa.setId(new Random().nextInt());
        System.out.println("Registro incluído com sucesso!");
        return pessoa;
    }

    @Override
    public List<Pessoa> findAll() {

        return new ArrayList<>();
    }

    @Override
    public void delete(Integer id) {


    }

    @Override
    public Pessoa findById(Integer id) {
        return null;
    }
}
