package com.step1.learning.springboot_microservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserDaoService userDaoService;

    public UserController(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    @GetMapping(path="/users")
    public List<User> retrieveAllUsers() {
        return userDaoService.findAll();
    }

    @GetMapping(path="/users/{id}")
    public User retrieveUser(@PathVariable Integer id) {
        return userDaoService.findOne(id);
    }

    @PostMapping(path="/users/createUser")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        userDaoService.createUser(user);
        //return userDaoService.findAll();
        return ResponseEntity.created(null).build();
    }
}
