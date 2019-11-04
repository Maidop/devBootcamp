package com.devBootcamp.exercicio10.service.impl;

import com.devBootcamp.exercicio10.model.Vendedor;
import com.devBootcamp.exercicio10.service.VendedorService;

public class VendedorServiceImpl extends CrudServiceImpl<Vendedor> implements VendedorService {
    @Override
    protected void preSave(Vendedor entity) {
        if (entity.getNome() == null) {
            throw new RuntimeException("Obrigatório informar o nome do vendedor!");
        }
    }
}
