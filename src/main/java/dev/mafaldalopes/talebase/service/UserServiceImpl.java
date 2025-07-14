package dev.mafaldalopes.talebase.service;

import dev.mafaldalopes.talebase.exception.UserNotFoundException;
import dev.mafaldalopes.talebase.persistence.dao.UserDao;
import dev.mafaldalopes.talebase.persistence.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveOrUpdate(User user) {
        userDao.saveOrUpdate(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public void delete(Integer id) {
        userDao.delete(id);
    }

    @Override
    public User findById(Integer id) throws UserNotFoundException {
        return userDao.findById(id).
                orElseThrow(() -> new UserNotFoundException("User with id " + id + " not found."));
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
