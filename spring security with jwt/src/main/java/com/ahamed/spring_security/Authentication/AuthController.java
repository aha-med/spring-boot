package com.ahamed.spring_security.Authentication;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    private User user;
        private final AuthenticationService service;
    @PostMapping("/register")
    public ResponseEntity<com.ahamed.spring_security.Authentication.AuthenticationResponse> register(
            @RequestBody RegisterRequest registerRequest){
         return ResponseEntity.ok(service.request(registerRequest));
    }
    @PostMapping("/authenticate")
    public ResponseEntity<com.ahamed.spring_security.Authentication.AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest registerRequest){
        return ResponseEntity.ok(service.authenticate(registerRequest));
    }


}
