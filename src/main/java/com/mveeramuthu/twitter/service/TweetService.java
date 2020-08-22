package com.mveeramuthu.twitter.service;

import com.mveeramuthu.twitter.model.Tweet;
import com.mveeramuthu.twitter.repository.TweetRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;

@Service
@Transactional(readOnly = true)
public class TweetService {
    private final TweetRepository tweetRepository;
    
    public TweetService(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }
    
    public Flux<Tweet> getTweets() {
        return null;
    }
}