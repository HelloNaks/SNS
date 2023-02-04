package com.myproject.sns.controller;

import com.myproject.sns.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userservice;


    // TODO : implement
    @PostMapping
    public void join() {
        // join
        userservice.join("","");
    }
}
