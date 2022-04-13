package ed.izabella.pp_3_1_1_springboot.dao;

import ed.izabella.pp_3_1_1_springboot.model.User;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDAOHib implements UserDAO{

    private final EntityManager em;

    public UserDAOHib(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<User> index() {
        TypedQuery<User> query= em.createQuery("from User", User.class);
        return query.getResultList();
    }

    @Override
    public User show(int id) {
        User user = em.find(User.class, id);
        return user;
    }

    @Override
    public void save(User user){
        em.persist(user);
    }

    @Override
    public void update(User updatedUser){
        em.merge(updatedUser);
    }

    @Override
    public void delete(int id) {
        User user = em.find(User.class, id);
        em.remove(user);
    }
}
