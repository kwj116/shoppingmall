package com.shoppingmallproject.domain;

import com.shoppingmallproject.domain.user.User;
import jakarta.persistence.*;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;

    @Column(name = "product_number", nullable = false)
    private int productNumber;

    @Column(name = "product_quantity", nullable = false)
    private int productQuantity;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private User userId;

    @OneToOne
    @JoinColumn(name = "product_number", referencedColumnName = "productId")
    private Product productId;
}
