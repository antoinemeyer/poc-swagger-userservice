package com.teketik.userservice;

import com.northlabs.demo.api.UserApi;
import com.northlabs.demo.api.model.User;
import com.teketik.userservice.dal.UserRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserRestController implements UserApi {

    @Resource
    private UserRepository userRepository;
    
    @Override
    public ResponseEntity<User> getUserById(Long id) {
        return ResponseEntity.of(
            userRepository
                .findById(id)
                .map(this::map)
        );
    }

    private User map(com.teketik.userservice.domain.User user) {
        return new User()
            .firstName(user.getName());
    }
}
