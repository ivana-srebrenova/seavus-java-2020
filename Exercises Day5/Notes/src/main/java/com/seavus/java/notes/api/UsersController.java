package com.seavus.java.notes.api;

import com.seavus.java.notes.model.User;
import com.seavus.java.notes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/users")
    public List<User> findUsers() {
        return userService.findUsers();

    }

}
