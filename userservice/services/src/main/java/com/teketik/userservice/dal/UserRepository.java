package com.teketik.userservice.dal;

import com.teketik.userservice.domain.Gender;
import com.teketik.userservice.domain.User;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class UserRepository {

    private static final Map<Long, User> REPOSITORY = new HashMap<>(3);
    static {
        REPOSITORY.put(1L, new User(1L, "first 1", "last 1", LocalDate.of(1950, 1, 1), Gender.MALE));
    }
    
    public Optional<User> findById(Long id) {
        return Optional.ofNullable(
            REPOSITORY.get(id)
        );
    }
    
}
