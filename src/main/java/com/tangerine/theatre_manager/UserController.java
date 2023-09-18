package com.tangerine.theatre_manager;

import com.tangerine.theatre_manager.global.jwt.JwtPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final JwtPrincipal jwtPrincipal;

    public UserController(JwtPrincipal jwtPrincipal) {
        this.jwtPrincipal = jwtPrincipal;
    }

    @GetMapping(path = "/me")
    public String test() {
        return jwtPrincipal.email();
    }

}
