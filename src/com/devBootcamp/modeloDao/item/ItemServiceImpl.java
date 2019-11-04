package com.devBootcamp.modeloDao.item;

import java.util.List;

public class ItemServiceImpl implements ItemService {

    private ItemCrudDao itemCrudDao = new ItemJpaDaoImp();

    @Override
    public Item save(Item item) {
        return itemCrudDao.save(item);
    }

    @Override
    public List<Item> findAll() {
        return itemCrudDao.findAll();
    }

    @Override
    public void delete(Integer id) {
        itemCrudDao.delete(id);
    }

    @Override
    public Item findById(Integer id) {
        return itemCrudDao.findById(id);
    }
}
