package com.refer.you.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Service;

import com.refer.you.model.User;
import com.refer.you.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getOrCreateUser(@AuthenticationPrincipal OidcUser principal) {
        String username = principal.getAttribute("preferred_username");
        Optional<User> userOptional = userRepository.findByUsername(username);

        if (userOptional.isPresent()) {
            return userOptional.get();
        } else {
            User newUser = new User();
            newUser.setUsername(username);
            newUser.setCompanyName(principal.getAttribute("companyName"));
            return userRepository.save(newUser);
        }
    }
}
