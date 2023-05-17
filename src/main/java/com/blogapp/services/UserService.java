package com.blogapp.services;

import com.blogapp.entities.User;
import com.blogapp.payloads.UserDto;

public interface UserService {

    UserDto createUser(UserDto user);
}
