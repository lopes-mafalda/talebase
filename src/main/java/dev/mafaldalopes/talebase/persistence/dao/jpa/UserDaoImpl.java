package dev.mafaldalopes.talebase.persistence.dao.jpa;

import dev.mafaldalopes.talebase.persistence.dao.UserDao;
import dev.mafaldalopes.talebase.persistence.model.User;

public class UserDaoImpl extends GenericDao<User> implements UserDao {

    public UserDaoImpl() {
        super(User.class);
    }
}
