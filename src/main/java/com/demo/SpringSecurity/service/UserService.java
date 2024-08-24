package com.demo.SpringSecurity.service;

import com.demo.SpringSecurity.dao.UserRepo;
import com.demo.SpringSecurity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;

    public User saveUser(User user) {
        return repo.save(user) ;

    }
}
