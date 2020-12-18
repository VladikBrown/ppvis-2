package com.vladbrown.core.model.dao;

import java.util.List;

public interface Dao<T> {

    T findById(Long id);

    List<T> getAll();

    void save(T t);

    void update(T t);

    void delete(T t);
}
