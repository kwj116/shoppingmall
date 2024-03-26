package com.shoppingmallproject.domain.order;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class OrderGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_group_number", nullable = false)
    private int orderGroupNumber;

    @OneToMany
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private String userId;

    @Column(name = "order_date", nullable = false)
    private Timestamp orderDate;

    @Column(name = "deli_addr", nullable = false)
    private String delAddress;

    @Column(name = "reward")
    private int reward;


}
