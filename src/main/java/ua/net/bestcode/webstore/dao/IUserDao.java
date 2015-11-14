package ua.net.bestcode.webstore.dao;


import ua.net.bestcode.webstore.model.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();
    void addUser(User user);
}
