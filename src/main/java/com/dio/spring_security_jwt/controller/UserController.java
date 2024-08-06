package com.dio.spring_security_jwt.controller;

import com.dio.spring_security_jwt.model.User;
import com.dio.spring_security_jwt.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public void createUser(@RequestBody User user){
        this.service.createUser(user);
    }
}
