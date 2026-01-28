package com.example.springSecurityDemo.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String greet(){
        return "Hello";
    }

    @GetMapping("/user")
    public String userGreet(){
        return "Hello user";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/admin")
    public String adminGreet(){
        return "Hello admin";
    }


}
