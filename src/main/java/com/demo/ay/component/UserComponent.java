package com.demo.ay.component;

import com.demo.ay.Controller.UserController;
import com.demo.ay.module.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserComponent {

    private UserController userController;

    @Autowired
    public UserComponent(UserController userController) {
        this.userController = userController;
    }

    public User getUser() {
        return userController.getUser();
    }
}
