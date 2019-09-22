package com.teketik.userservice.mappers;

import com.teketik.userservice.api.model.User;

import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    User mapUser(com.teketik.userservice.domain.User user);
    
}
