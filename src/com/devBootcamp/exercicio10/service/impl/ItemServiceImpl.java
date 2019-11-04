package com.devBootcamp.exercicio10.service.impl;

import com.devBootcamp.exercicio10.model.Item;
import com.devBootcamp.exercicio10.service.ItemService;

public class ItemServiceImpl extends CrudServiceImpl<Item> implements ItemService {
    @Override
    protected void preSave(Item entity) {
        if(entity.getQtdeEstoque() == null){
            throw new RuntimeException("Necessário informar a quantidade do item " + entity.getDescricao() + " em estoque");
        }
        if (entity.getQtdeEstoque().signum() < 0){
            throw new RuntimeException("Valor da quantidade em estoque não pode ser negativa!");
        }
    }
}
