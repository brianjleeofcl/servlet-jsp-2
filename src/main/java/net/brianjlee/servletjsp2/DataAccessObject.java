package net.brianjlee.servletjsp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class DataAccessObject {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRM");
    private EntityManager em = emf.createEntityManager();

    public User[] getUsers() {
        Query query = em.createQuery("from User");

        List result = query.getResultList();
        User[] users = new User[result.size()];
        return (User[]) result.toArray(users);
    }
}
