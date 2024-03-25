package com.shoppingmallproject.domain.seller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SellerApllications {

    @Id
    @Column(name = "seller_id", nullable = false, unique = true)
    private String sellerId;

    @Column(name = "seller_pw", nullable = false)
    private String sellerPw;

    @Column(name = "seller_name", nullable = false)
    private String sellername;
}

