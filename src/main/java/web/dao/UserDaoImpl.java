package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.Model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager em;
    @Override
    public List<User> getAllUsers() {
        List<User> allUsers = em.createQuery("from User", User.class).getResultList();
        return allUsers;
    }

    @Override
    public void saveUser(User user) {
        em.persist(user);
    }

    @Override
    public void mergeUser(User user) {
        em.merge(user);
    }

    @Override
    public User getUser(int id) {
        User user = em.find(User.class, id);
        return user;
    }

    @Override
    public void deleteUser(int id) {
        em.remove(em.find(User.class, id));
    }

}
