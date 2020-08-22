package com.mveeramuthu.twitter.repository;

import com.mveeramuthu.twitter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByScreenName(String screenName);
}
