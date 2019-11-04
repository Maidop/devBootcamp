package com.devBootcamp.modeloDao.usuario;

import java.util.List;

public interface UsuarioDao {
    public Usuario save(Usuario pessoa);

    List<Usuario> findAll();

    void delete(Integer id);

    Usuario findById(Integer id);
}
