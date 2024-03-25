package com.shoppingmallproject.domain;

import jakarta.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id", nullable = false)
    private int reviewId;

    //FK
    private String userId;

    //FK
    private int productNumber;

    @Column(name = "review_title",nullable = false)
    private String reviewTitle;

    @Column(name = "review_content", nullable = false, columnDefinition = "Text")
    private String reviewContent;

    @Column(name = "score", nullable = false)
    private int score;



}
