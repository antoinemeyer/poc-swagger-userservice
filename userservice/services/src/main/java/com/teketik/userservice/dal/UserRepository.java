package com.teketik.userservice.dal;

import com.teketik.userservice.domain.User;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class UserRepository {

    private static final Map<Long, User> REPOSITORY = new HashMap<>(3);
    static {
        REPOSITORY.put(1L, new User(1L, "first 1", "last 1"));
        REPOSITORY.put(2L, new User(2L, "first 2", "last 2"));
        REPOSITORY.put(3L, new User(3L, "first 3", "last 3"));
    }
    
    public Optional<User> findById(Long id) {
        return Optional.ofNullable(
            REPOSITORY.get(id)
        );
    }
    
}
