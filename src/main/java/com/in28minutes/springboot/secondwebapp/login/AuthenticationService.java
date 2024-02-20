package com.in28minutes.springboot.secondwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password) {
        boolean validUsername = (username.equalsIgnoreCase("in28minutes"));
        boolean validPassword = (password.equalsIgnoreCase("dummy"));
        return validUsername && validPassword;
    }
}
