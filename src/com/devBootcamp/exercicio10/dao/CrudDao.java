package com.devBootcamp.exercicio10.dao;

import java.util.List;

public interface CrudDao<T extends BaseObject> {

    T save(T entity);

    void delete(Integer id);

    List<T> findAll();

    T findById(Integer id);
}