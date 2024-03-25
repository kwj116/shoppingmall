package com.shoppingmallproject.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cart {

    @Id
    @Column(name = "user_id", nullable = false, unique = true)
    private String userId;

    @Column(name = "product_number", nullable = false)
    private int productNumber;

    @Column(name = "product_quantity", nullable = false)
    private int productQuantity;


}
