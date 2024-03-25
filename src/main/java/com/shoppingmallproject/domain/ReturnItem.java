package com.shoppingmallproject.domain;

import jakarta.persistence.*;

@Entity
public class ReturnItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "returnItem_number", nullable = false)
    private int returnItemNumber;

    //FK : Order
    private int orderNumber;

    //FK : OrderGroup
    private int orderGroupNumber;

    @Column(name = "exchange", nullable = false)
    private Boolean exchange;

    @Column(name = "status", nullable = false)
    private Boolean status;


}
