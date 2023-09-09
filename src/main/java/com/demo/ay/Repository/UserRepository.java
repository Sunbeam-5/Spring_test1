package com.demo.ay.Repository;

import com.demo.ay.module.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser() {
        User user = new User();
        user.setNum(01);
        user.setName("Isbella");
        user.setAge(20);
        return user;
    }
}
