package com.devBootcamp.exercicio10.dao.impl;

import com.devBootcamp.exercicio10.dao.BaseObject;
import com.devBootcamp.exercicio10.dao.CrudDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CrudDaoImpl<T extends BaseObject> implements CrudDao<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public T save(T entity) {
        entity.setId(Math.abs(new Random().nextInt()));
        list.add(entity);
        return entity;
    }

    @Override
    public void delete(Integer id) {
        list.removeIf(entity -> entity.getId().equals(id));
    }

    @Override
    public List<T> findAll() {
        return list;
    }

    @Override
    public T findById(Integer id) {
        for (T entity : list) {
            if (entity.getId().equals(id)) {
                return entity;
            }
        }
        return null;
    }
}
