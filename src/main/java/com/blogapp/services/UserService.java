package com.blogapp.services;

import com.blogapp.entities.User;
import com.blogapp.payloads.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user);
    UserDto updateUser(UserDto user, Integer userId);
    UserDto getUserById(UserDto user, Integer userId);
    List<UserDto> getAllUser();

    void deleteUser(UserDto userId);
}
