package net.brianjlee.servletjsp2;

import javax.persistence.*;
import java.util.List;

public class DataAccessObject {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRM");

    public User[] getUsers() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("from User");

        List<User> result = query.getResultList();
        User[] users = new User[result.size()];
        return result.toArray(users);
    }

    public User getUser(int id) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<User> query = em.createQuery("from User where id = :id", User.class);
        query.setParameter("id", id);

        return query.getSingleResult();
    }

    public User insertUser(String firstName, String lastName, String phone) throws InstantiationException {
        EntityManager em = emf.createEntityManager();
        User user = new User();
        em.getTransaction().begin();
        em.persist(user);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        try {
            user.setPhone(phone);
        } catch (IllegalArgumentException e) {
            throw e;
        }
        em.getTransaction().commit();
        return user;
    }
}
