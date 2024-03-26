package com.shoppingmallproject.domain.seller;

import com.shoppingmallproject.domain.Product;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Seller {
    @Id
    @Column(name = "seller_id", nullable = false, unique = true)
    private String sellerId;

    @Column(name = "seller_pw", nullable = false)
    private String sellerPw;

    @Column(name = "seller_name", nullable = false)
    private String sellername;

    @Column(name = "authorization_status", nullable = false)
    private Boolean authorizationStatus;

    @Column(name = "signup_date", nullable = false)
    private Timestamp signupDate;

    @OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
    private List<Product> products = new ArrayList<>();
}
