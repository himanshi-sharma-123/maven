package org.example.controllers;

import guru.springframework.domain.UserCommand;
import org.example.User;

public class UserController {
    User saveUser(UserCommand command){
        return new User();
    }
}
