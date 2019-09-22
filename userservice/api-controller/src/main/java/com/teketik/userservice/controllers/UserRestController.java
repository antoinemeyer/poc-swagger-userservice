package com.teketik.userservice.controllers;

import com.teketik.userservice.api.UserApi;
import com.teketik.userservice.api.model.User;
import com.teketik.userservice.dal.UserRepository;
import com.teketik.userservice.mappers.UserMapper;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserRestController implements UserApi {

    @Resource
    private UserRepository userRepository;
    
    @Resource
    private UserMapper userMapper;
    
    @Override
    public ResponseEntity<User> getUserById(Long id) {
        return ResponseEntity.of(
            userRepository
                .findById(id)
                .map(userMapper::mapUser)
        );
    }
    
}
