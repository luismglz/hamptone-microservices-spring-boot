package com.ruisu.hamptoneapigateway.service;

import com.ruisu.hamptoneapigateway.model.User;

public interface AuthenticationService {
    User signInAndReturnJwt(User toSignInUser);
}
