package dev.mafaldalopes.talebase.service;

import dev.mafaldalopes.talebase.exception.UserNotFoundException;

public interface Service<T> {

    void saveOrUpdate(T t);
    void delete(T t);
    void delete(Integer id);
    T findById(Integer id) throws UserNotFoundException;
}
