package com.devBootcamp.modeloDao.item;

import java.util.List;

public interface ItemService {
    public Item save(Item item);

    List<Item> findAll();

    void delete(Integer id);

    Item findById(Integer id);
}
