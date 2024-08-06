package com.dio.spring_security_jwt.service;

import com.dio.spring_security_jwt.model.User;
import com.dio.spring_security_jwt.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    private final PasswordEncoder encoder;

    public UserService(UserRepository repository, PasswordEncoder encoder) {
        this.repository = repository;
        this.encoder = encoder;
    }

    public void createUser(User user){
        String pass = user.getPassword();
        user.setPassword(encoder.encode(pass));
        this.repository.save(user);
    }
}
