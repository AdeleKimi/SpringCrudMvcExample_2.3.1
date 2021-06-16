package ru.javamentor.june.dao;

import ru.javamentor.june.models.User;

import java.util.List;

public interface UserDao {
    public List<User> getAll();

    public User getUserById(long id);

    public void saveUser(User user);

    public void deleteUser(long id);

    public void updateUser(long id, User user);
}
