package com.mveeramuthu.twitter.controller;

import com.mveeramuthu.twitter.model.Tweet;
import com.mveeramuthu.twitter.model.User;
import com.mveeramuthu.twitter.service.TweetService;
import com.mveeramuthu.twitter.service.UserService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.security.Principal;

@RestController
@RequestMapping("/tweets")
public class TweetController {

    private final TweetService tweetService;
    private final UserService userService;

    public TweetController(TweetService tweetService, UserService userService) {
        this.tweetService = tweetService;
        this.userService = userService;
    }

    @GetMapping
    public Flux<Tweet> getAll(Principal principal) {
        return tweetService.getTweets();
    }
    
}