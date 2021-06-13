package com.lugonzo.Springboot101.Repository;

import com.lugonzo.Springboot101.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {
    User findByUsername(String userName);
}
