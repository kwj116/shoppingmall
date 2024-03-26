package com.shoppingmallproject.domain;

import com.shoppingmallproject.domain.seller.Seller;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_number", nullable = false)
    private Long productNumber;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "stock_quantity", nullable = false)
    private int stockQuantity;

    @Column(name = "description", nullable = false, columnDefinition = "Text")
    private String description;

    @Column(name = "registration_date", nullable = false)
    private Timestamp registrationDate;

    @Column(name = "restock_date")
    private Timestamp restockDate;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    @Column(name = "brand", nullable = false)
    private String brand;

    @ManyToOne
    @JoinColumn(name = "seller_id", referencedColumnName = "seller_id")
    private Seller seller;

    @OneToMany(mappedBy = "product")
    private List<Review> reviewList = new ArrayList<>();
}
