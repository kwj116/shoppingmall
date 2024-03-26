package com.shoppingmallproject.domain;

import com.shoppingmallproject.domain.user.User;
import jakarta.persistence.*;

@Entity
public class Restock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restock_number",nullable = false)
    private Long restockNumber;

    @OneToOne
    @JoinColumn(name = "product_number", referencedColumnName = "product_number")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

}
