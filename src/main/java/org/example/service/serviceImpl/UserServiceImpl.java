package org.example.service.serviceImpl;

import org.example.dao.UserDao;
import org.example.dao.daoImpl.UserDaoImpl;
import org.example.model.User;
import org.example.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao=new UserDaoImpl();
    @Override
    public void createUsersTable() {

    }

    @Override
    public void dropUsersTable() {
        userDao.dropUsersTable();

    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);

    }

    @Override
    public void removeUserById(long id) {
        userDao.removeUserById(id);

    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        userDao.cleanUsersTable();

    }
}
