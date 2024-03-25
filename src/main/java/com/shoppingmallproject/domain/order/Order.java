package com.shoppingmallproject.domain.order;


import jakarta.persistence.*;

@Entity
public class Order {

    @Id
    @Column(name = "order_number", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderNumber;


    private int orderGroupNumber;


}
