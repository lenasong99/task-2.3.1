package web.dao;

import web.Model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public void saveUser(User user);
    public void mergeUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}
