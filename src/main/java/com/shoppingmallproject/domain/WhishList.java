package com.shoppingmallproject.domain;

import jakarta.persistence.*;

@Entity
public class WhishList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wishlist_id",nullable = false)
    private int whishListId;

    private String userId;

    private int productNumber;


}
