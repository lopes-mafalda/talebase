package dev.mafaldalopes.talebase.persistence.dao.jpa;

import dev.mafaldalopes.talebase.persistence.dao.UserDao;
import dev.mafaldalopes.talebase.persistence.model.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserDaoImpl extends GenericDao<User> implements UserDao {

    public UserDaoImpl() {
        super(User.class);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.of(em.createQuery("FROM User WHERE username = :username", modelType).getSingleResult());
    }
}
