package com.lugonzo.Springboot101.Service;

import com.lugonzo.Springboot101.Entity.User;
import com.lugonzo.Springboot101.Entity.UserPrincipal;
import com.lugonzo.Springboot101.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(s);
        if(user==null){
            throw new UsernameNotFoundException("User 404");
        }

        return new UserPrincipal(user);
    }
}
