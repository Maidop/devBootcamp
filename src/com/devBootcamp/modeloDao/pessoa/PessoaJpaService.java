package com.devBootcamp.modeloDao.pessoa;

import java.util.List;
import java.util.Random;

public class PessoaJpaService implements PessoaService {

    private PessoaDao pessoaDao = new PessoaJpaDaoImpl();

    @Override
    public Pessoa save(Pessoa pessoa) {
        return pessoaDao.save(pessoa);
    }

    @Override
    public void delete(Integer id) {
        System.out.println("[Service] - delete");
        pessoaDao.delete(id);
    }

    @Override
    public List<Pessoa> findAll() {
        return pessoaDao.findAll();
    }

    @Override
    public Pessoa findById(Integer id) {
        return pessoaDao.findById(id);
    }
}
