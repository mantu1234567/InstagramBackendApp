package com.mantu.InstagramBackendApp.repository;

import com.mantu.InstagramBackendApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {
    User findFirstByUserEmail(String newEmail);
}
