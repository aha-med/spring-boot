package com.ahamed.spring_security.Controller;

import com.ahamed.spring_security.Repository.UserRepository;
import com.ahamed.spring_security.user.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/auth/controller")
public class Controller {
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("welcome to safe website");
    }
}
