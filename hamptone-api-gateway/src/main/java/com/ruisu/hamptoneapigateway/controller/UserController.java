package com.ruisu.hamptoneapigateway.controller;

import com.ruisu.hamptoneapigateway.model.Role;
import com.ruisu.hamptoneapigateway.security.UserPrincipal;
import com.ruisu.hamptoneapigateway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PutMapping("update/{role}")
    public ResponseEntity<?> changeRole(@AuthenticationPrincipal UserPrincipal userPrincipal, @PathVariable Role role) {
        userService.changeRole(role, userPrincipal.getUsername());
        return ResponseEntity.ok(true);
    }
}
