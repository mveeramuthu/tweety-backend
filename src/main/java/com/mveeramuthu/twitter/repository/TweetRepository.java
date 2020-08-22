package com.mveeramuthu.twitter.repository;

import com.mveeramuthu.twitter.model.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TweetRepository extends JpaRepository<Tweet, Integer> {
    List<Tweet> findByTweetUser_ScreenNameOrContentContains(String screenName, String mention);
}