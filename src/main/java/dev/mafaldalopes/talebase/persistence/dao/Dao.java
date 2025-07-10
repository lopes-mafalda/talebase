package dev.mafaldalopes.talebase.persistence.dao;

import java.util.List;

public interface Dao<T> {

    T findById(Integer id);
    List<T> findAll();
    T saveOrUpdate(T t);
    void delete(T t);
    void delete(Integer id);
}
