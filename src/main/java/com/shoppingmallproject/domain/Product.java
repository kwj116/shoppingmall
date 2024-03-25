package com.shoppingmallproject.domain;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_number", nullable = false)
    private int productNumber;

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

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    @Column(name = "brand", nullable = false)
    private String brand;
}
