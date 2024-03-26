package com.shoppingmallproject.domain;

import com.shoppingmallproject.domain.user.User;
import jakarta.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id", nullable = false)
    private Long reviewId;

    @Column(name = "review_title",nullable = false)
    private String reviewTitle;

    @Column(name = "review_content", nullable = false, columnDefinition = "Text")
    private String reviewContent;

    @Column(name = "score", nullable = false)
    private int score;

    @Column(name = "image_url", columnDefinition = "Text")
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_number", referencedColumnName = "product_number")
    private Product product;
}