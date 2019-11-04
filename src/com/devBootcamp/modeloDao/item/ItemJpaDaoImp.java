package com.devBootcamp.modeloDao.item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ItemJpaDaoImp implements ItemCrudDao {

    private List<Item> itemList = new ArrayList<>();

    @Override
    public Item save(Item item) {
        item.setId(new Random().nextInt());
        itemList.add(item);
        return item;
    }

    @Override
    public List<Item> findAll() {
        return itemList;
    }

    @Override
    public void delete(Integer id) {
        itemList.removeIf(item -> item.getId().equals(id));
    }

    @Override
    public Item findById(Integer id) {
        return itemList.stream().filter(item -> item.getId().equals(id)).findAny().orElse(new Item());
    }
}
