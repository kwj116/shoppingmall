package com.shoppingmallproject.domain;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.shoppingmallproject.domain.user.User;
import jakarta.persistence.*;

@Entity
public class DeliveryAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addr_number", nullable = false)
    private Long addrNumber;

    @Column(name = "addr_title",nullable = false)
    private String addrTitle;

    @Column(name = "addr_content", nullable = false)
    private String addrContent;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;
}
