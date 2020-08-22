package com.mveeramuthu.twitter.controller;

import com.mveeramuthu.twitter.model.User;
import com.mveeramuthu.twitter.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.security.Principal;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{screenName}")
    public Mono<User> getUserByScreenName(@PathVariable String screenName) {
        return userService.getUserByScreenName(screenName);
    }
    
}