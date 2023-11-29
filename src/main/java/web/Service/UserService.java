package web.Service;

import web.Model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User getUser(int id);
    public void saveUser(User user);
    public void mergeUser(User user);
    public void deleteUser(int id);
}
