package dev.mafaldalopes.talebase.persistence.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {

    Optional<T> findById(Integer id);
    List<T> findAll();
    T saveOrUpdate(T t);
    void delete(T t);
    void delete(Integer id);
}
