package com.blogapp.repositories;

import com.blogapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInterface extends JpaRepository<User, Integer> {

}
