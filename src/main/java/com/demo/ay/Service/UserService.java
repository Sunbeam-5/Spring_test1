package com.demo.ay.Service;

import com.demo.ay.Controller.UserController;
import com.demo.ay.Repository.UserRepository;
import com.demo.ay.module.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser() {
        return userRepository.getUser();
    }
}
