package org.example.dao.daoImpl;

import jakarta.persistence.Query;
import org.example.config.HibernateConfig;
import org.example.dao.UserDao;
import org.example.model.User;
import org.hibernate.Session;
import org.hibernate.engine.spi.SessionLazyDelegator;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public void createUsersTable() {

    }

    @Override
    public void dropUsersTable() {
        Session session=HibernateConfig.getSession().openSession();
        session.beginTransaction();
        String sql="drop table users";
        session.createNativeQuery(sql).executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully deleted table");
    }

    @Override
    public void saveUser(User user) {

        Session session= HibernateConfig.getSession().openSession();
        session.beginTransaction();
        session.persist(user);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully saved");
    }

    @Override
    public void removeUserById(long id) {
        Session session=HibernateConfig.getSession().openSession();
        session.beginTransaction();
        User user=session.get(User.class,id);
        session.remove(user);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully deleted "+user.getFirstName());
    }

    @Override
    public List<User> getAllUsers() {
        Session session=HibernateConfig.getSession().openSession();
        session.beginTransaction();
        List<User>users=session.createQuery("select s from User s",User.class).getResultList();
session.getTransaction().commit();
session.close();
        return users;
    }

    @Override
    public void cleanUsersTable() {
        Session session=HibernateConfig.getSession().openSession();
        session.beginTransaction();
        session.createQuery("delete from User ").executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully deleted users");
    }
}
