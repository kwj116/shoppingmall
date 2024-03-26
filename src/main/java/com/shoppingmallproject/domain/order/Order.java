package com.shoppingmallproject.domain.order;


import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @Column(name = "order_number", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderNumber;

    @Column(name = "product_quantity", nullable = false)
    private int productQuantity;

    @Column(name = "is_cancelled", nullable = false)
    private Boolean isCancelled;

    @Column(name = "order_date", nullable = false)
    private Timestamp orderDate;

    @Column(name = "status", nullable = false)
    private Boolean status;

    @OneToOne
    private String sellerId;

    @ManyToOne
    @JoinColumn(name = "order_group_id", referencedColumnName = "")
    private int orderGroupNumber;

    @OneToOne
    private int productNumber;

    @OneToOne
    @JoinColumn(name = "")
    private int coupon;
}
