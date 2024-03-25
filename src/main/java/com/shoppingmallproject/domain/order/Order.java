package com.shoppingmallproject.domain.order;


import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Order {

    @Id
    @Column(name = "order_number", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderNumber;


    private int orderGroupNumber;

    private int productNumber;

    @Column(name = "product_quantity", nullable = false)
    private int productQuantity;

    private int coupon;

    @Column(name = "is_cancelled", nullable = false)
    private Boolean isCancelled;

    @Column(name = "order_date", nullable = false)
    private Timestamp orderDate;

    private String sellerId;

    @Column(name = "status", nullable = false)
    private Boolean status;

}
