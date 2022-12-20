package com.example.user_management.repository;

import com.example.user_management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {

    @Query (
            value = "SELECT * FROM user WHERE user.email = ?",
            nativeQuery = true
    )
    Optional<User> findUserByEmail(String email);

}
