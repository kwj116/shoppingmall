package com.shoppingmallproject.domain;

import com.shoppingmallproject.domain.user.User;
import jakarta.persistence.*;

@Entity
public class Wish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wishlist_id", nullable = false)
    private Long wishNumber;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "product_number", referencedColumnName = "product_number")
    private Product product;
}
