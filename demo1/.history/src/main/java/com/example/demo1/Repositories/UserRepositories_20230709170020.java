package com.example.demo1.Repositories;

import com.example.demo1.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.id = :id")
    List<User> searchUsers(@Param("id") Long id);
}