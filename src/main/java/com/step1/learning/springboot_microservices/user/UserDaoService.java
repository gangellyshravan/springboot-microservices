package com.step1.learning.springboot_microservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static Integer userId = 0;
    static {
        users.add(new User(++userId, "Mike", LocalDate.now().minusYears(30)));
        users.add(new User(++userId, "Ran", LocalDate.now().minusYears(25)));
        users.add(new User(++userId, "Salmon", LocalDate.now().minusYears(40)));
    }
    public List<User> findAll() {
        return users;
    }

    public User findOne(int id) {
        Predicate<User> predicate = u -> u.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public void createUser(User user) {
        user.setId(++userId);
        users.add(user);
        System.out.println(users);
    }
}
