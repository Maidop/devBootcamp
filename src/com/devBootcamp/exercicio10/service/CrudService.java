package com.devBootcamp.exercicio10.service;

import com.devBootcamp.exercicio10.dao.BaseObject;

import java.util.List;

public interface CrudService<T extends BaseObject> {
    T save(T entity);

    void delete(Integer id);

    List<T> findAll();

    T findById(Integer id);
}
