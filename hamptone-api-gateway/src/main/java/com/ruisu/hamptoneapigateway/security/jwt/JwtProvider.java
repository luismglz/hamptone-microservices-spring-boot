package com.ruisu.hamptoneapigateway.security.jwt;

import com.ruisu.hamptoneapigateway.model.User;
import com.ruisu.hamptoneapigateway.security.UserPrincipal;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.Authentication;

public interface JwtProvider {

    String generateToken(UserPrincipal user);

    String generateToken(User user);

    Authentication getAuthentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);
}
