package com.devBootcamp.modeloDao.pessoa;

import java.util.List;

public interface PessoaDao {
    public Pessoa save(Pessoa pessoa);

    List<Pessoa> findAll();

    void delete(Integer id);

    Pessoa findById(Integer id);
}
