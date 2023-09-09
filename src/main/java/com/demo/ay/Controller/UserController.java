package com.demo.ay.Controller;

import com.demo.ay.Service.UserService;
import com.demo.ay.module.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public User getUser() {
        return userService.getUser();
    }
}
