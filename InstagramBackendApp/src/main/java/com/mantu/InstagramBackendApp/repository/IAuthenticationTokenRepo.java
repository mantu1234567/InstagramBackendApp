package com.mantu.InstagramBackendApp.repository;

import com.mantu.InstagramBackendApp.model.AuthenticationToken;
import com.mantu.InstagramBackendApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthenticationTokenRepo extends JpaRepository<AuthenticationToken,Integer> {
    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);
}
