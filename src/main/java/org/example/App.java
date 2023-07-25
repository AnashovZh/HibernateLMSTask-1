package org.example;

import org.example.model.User;
import org.example.service.UserService;
import org.example.service.serviceImpl.UserServiceImpl;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        UserService userService=new UserServiceImpl();
        User user = new User("Hlds","Tdsfasva","wwdesdw@gmail.com", (byte) 20);
//        userService.saveUser(user);
//        userService.removeUserById(2L);
//        userService.getAllUsers().forEach(System.out::println);
//        userService.cleanUsersTable();
        userService.dropUsersTable();



    }
}
