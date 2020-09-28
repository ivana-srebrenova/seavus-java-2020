package com.seavus.java.notes.service;


import com.seavus.java.notes.model.User;
import com.seavus.java.notes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> findUsers() {
        return userRepository.findAll();
    }
}
