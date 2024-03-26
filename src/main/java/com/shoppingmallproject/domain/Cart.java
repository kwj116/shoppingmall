package com.shoppingmallproject.domain;

import com.shoppingmallproject.domain.user.User;
import jakarta.persistence.*;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartNumber;

    @Column(name = "product_quantity", nullable = false)
    private int productQuantity;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "product_number", referencedColumnName = "product_number")
    private Product productNumber;
}
