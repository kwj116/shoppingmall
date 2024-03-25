package com.shoppingmallproject.domain;

import jakarta.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_number", nullable = false)
    private int categoryNumber;

    //FK : Product
    private int productNumber;

    @Column(name = "accessory",nullable = false)
    private Boolean accessory;
    @Column(name = "bag",nullable = false)
    private Boolean bag;
    @Column(name = "pad",nullable = false)
    private Boolean pad;
    @Column(name = "phone_case",nullable = false)
    private Boolean phoneCase;

}
