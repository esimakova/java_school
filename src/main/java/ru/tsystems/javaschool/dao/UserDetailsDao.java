package ru.tsystems.javaschool.dao;

import ru.tsystems.javaschool.model.User;

public interface UserDetailsDao {

    User findUserByUsername(String username);
}
