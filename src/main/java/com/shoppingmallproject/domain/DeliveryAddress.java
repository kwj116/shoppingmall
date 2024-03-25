package com.shoppingmallproject.domain;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import jakarta.persistence.*;

@Entity
public class DeliveryAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addr_number", nullable = false)
    private int addrNumber;

    //FK : User
    private int userId;

    @Column(name = "addr_title",nullable = false)
    private String addrTitle;

    @Column(name = "addr_content", nullable = false)
    private String addrContent;


}
