package com.shoppingmallproject.domain;

import jakarta.persistence.*;

@Entity
public class RecentlyViewedProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "viewed_number",nullable = false)
    private int viewdNumber;

    //FK : Product
    private int productNumber;

    //FK : User
    private int userId;

}
