package com.ruisu.hamptoneapigateway.service;

import com.ruisu.hamptoneapigateway.model.Role;
import com.ruisu.hamptoneapigateway.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);

    User findByUsernameAndGetToken(String username);
}
