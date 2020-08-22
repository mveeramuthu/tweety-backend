package com.mveeramuthu.twitter.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.security.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @CreationTimestamp
    private Timestamp postTime;
    
    @ManyToOne
    private User tweetUser;
    
    @NotNull
    private String content;
}