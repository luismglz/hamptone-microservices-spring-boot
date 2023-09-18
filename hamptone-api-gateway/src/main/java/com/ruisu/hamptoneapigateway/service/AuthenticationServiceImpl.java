package com.ruisu.hamptoneapigateway.service;

import com.ruisu.hamptoneapigateway.model.User;
import com.ruisu.hamptoneapigateway.security.UserPrincipal;
import com.ruisu.hamptoneapigateway.security.jwt.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtProvider jwtProvider;

    @Override
    public User signInAndReturnJwt(User toSignInUser) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(toSignInUser.getUsername(), toSignInUser.getPassword())
        );

        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
        String jwt = jwtProvider.generateToken(userPrincipal);

        User user = userPrincipal.getUser();

        user.setToken(jwt);
        return user;
    }

}
