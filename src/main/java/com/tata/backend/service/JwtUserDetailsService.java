package com.tata.backend.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 *
 * @author Pablo Juarez
 */
@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Value("${jwt.username}")
    private String username;

    @Value("${jwt.password}")
    private String password;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User(this.username,this.password,new ArrayList<>());
    }

}
