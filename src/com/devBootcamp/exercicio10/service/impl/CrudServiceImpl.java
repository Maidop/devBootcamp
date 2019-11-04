package com.devBootcamp.exercicio10.service.impl;

import com.devBootcamp.exercicio10.dao.BaseObject;
import com.devBootcamp.exercicio10.dao.CrudDao;
import com.devBootcamp.exercicio10.dao.impl.CrudDaoImpl;
import com.devBootcamp.exercicio10.service.CrudService;

import java.util.List;

public abstract class CrudServiceImpl<T extends BaseObject> implements CrudService<T> {

    private CrudDao<T> crudDao = new CrudDaoImpl<>();

    protected void preSave(T entity) {

    };

    protected void postSave(T entity) {

    };

    @Override
    public T save(T entity) {
        preSave(entity);
        entity = crudDao.save(entity);
        postSave(entity);
        return entity;
    }

    @Override
    public void delete(Integer id) {
        crudDao.delete(id);
    }

    @Override
    public List<T> findAll() {
        return crudDao.findAll();
    }

    @Override
    public T findById(Integer id) {
        return crudDao.findById(id);
    }
}
