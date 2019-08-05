package ru.tsystems.javaschool.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.tsystems.javaschool.model.User;

@Repository
public class UserDetailsDaoImpl implements UserDetailsDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User findUserByUsername(String username) {
        return sessionFactory.getCurrentSession().get(User.class, username);
    }
}
