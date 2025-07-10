package dev.mafaldalopes.talebase.persistence.dao.jpa;

import dev.mafaldalopes.talebase.persistence.dao.Dao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class GenericDao<T> implements Dao<T> {

    @PersistenceContext
    private EntityManager em;
    private Class<T> modelType;

    public GenericDao(Class<T> modelType) {
        this.modelType = modelType;
    }

    @Override
    public T findById(Integer id) {
        return em.find(modelType, id);
    }

    @Override
    public List<T> findAll() {
        TypedQuery<T> query = em.createQuery("FROM " + modelType.getSimpleName(), modelType);

        return query.getResultList();
    }

    @Override
    public T saveOrUpdate(T t) {
        return em.merge(t);
    }

    @Override
    public void delete(T t) {
        em.remove(t);
    }

    @Override
    public void delete(Integer id) {
        em.remove(em.find(modelType, id));
    }
}
