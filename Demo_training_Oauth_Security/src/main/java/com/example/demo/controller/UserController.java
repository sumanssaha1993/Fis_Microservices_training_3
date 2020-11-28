package com.example.demo.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/")
	public String home(Principal user) {
        return "Hi " + user.getName();
    }
	
	@GetMapping("/greetings")
    public String greetings() {
        return "Hey! Welcome to Spring Security OAuth2 Training";
    }
	
	@GetMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
	
}
