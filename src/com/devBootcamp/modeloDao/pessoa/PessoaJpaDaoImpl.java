package com.devBootcamp.modeloDao.pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PessoaJpaDaoImpl implements PessoaDao {

    private List<Pessoa> pessoaList = new ArrayList<>();


    @Override
    public Pessoa save(Pessoa pessoa) {
        pessoa.setId(new Random().nextInt());
        System.out.println("[JPA] - Registro incluído com sucesso!");
        pessoaList.add(pessoa);
        return pessoa;
    }

    @Override
    public List<Pessoa> findAll() {
        return pessoaList;
    }

    @Override
    public void delete(Integer id) {

        pessoaList.removeIf(pessoa -> pessoa.getId().equals(id));
    }

    @Override
    public Pessoa findById(Integer id) {
//        for (Pessoa pessoa : pessoaList) {
//            if(pessoa.getId().equals(id)){
//                return pessoa;
//            }
//        }
//        return new Pessoa();
        return pessoaList.stream().filter(pessoa -> pessoa.getId().equals(id)).findAny().orElse(new Pessoa());
    }
}
