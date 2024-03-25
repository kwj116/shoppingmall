package com.shoppingmallproject.domain;

import jakarta.persistence.*;

@Entity
public class Restock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restock_number",nullable = false)
    private int restockNumber;

    //FK : Product
    private int productNumber;

    //FK : User
    private int userId;


}
