package dev.mafaldalopes.talebase.service;

import dev.mafaldalopes.talebase.persistence.model.User;

import java.util.Optional;

public interface UserService extends Service<User> {

    Optional<User> findByUsername(String username);
}
