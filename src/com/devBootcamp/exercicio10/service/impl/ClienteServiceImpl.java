package com.devBootcamp.exercicio10.service.impl;

import com.devBootcamp.exercicio10.model.Cliente;
import com.devBootcamp.exercicio10.service.ClienteService;

public class ClienteServiceImpl extends CrudServiceImpl<Cliente> implements ClienteService {
    @Override
    protected void preSave(Cliente entity) {
        if (entity.getNome() == null) {
            throw new RuntimeException("Obrigatório informar o nome do cliente!");
        }
    }
}
