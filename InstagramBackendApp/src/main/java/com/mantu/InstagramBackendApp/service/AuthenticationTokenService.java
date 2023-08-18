package com.mantu.InstagramBackendApp.service;

import com.mantu.InstagramBackendApp.model.AuthenticationToken;
import com.mantu.InstagramBackendApp.repository.IAuthenticationTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationTokenService {
    @Autowired
    IAuthenticationTokenRepo authenticationTokenRepo;
    public boolean authenticate(String email,String authTokenValue){
        AuthenticationToken authenticationToken = authenticationTokenRepo.findFirstByTokenValue(authTokenValue);
        String tokenConnectedEmail = authenticationToken.getUser().getUserEmail();
        return tokenConnectedEmail.equals(email);
    }
    public void saveAuthenticationToken(AuthenticationToken authToken){
        authenticationTokenRepo.save(authToken);
    }
}
