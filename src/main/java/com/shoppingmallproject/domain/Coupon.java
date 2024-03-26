package com.shoppingmallproject.domain;

import com.shoppingmallproject.domain.user.User;
import jakarta.persistence.*;
import org.checkerframework.checker.units.qual.C;

import java.sql.Timestamp;

@Entity
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coupon_number", nullable = false)
    private Long couponNumber;

    @Column(name = "discount_type", nullable = false)
    private String discountType;

    @Column(name = "discount_amount", nullable = false)
    private int discountAmount;

    @Column(name = "minimum_purchase_amount ", nullable = false)
    private int minPurchaseAmount;

    @Column(name = "start_date", nullable = false)
    private Timestamp startDate;

    @Column(name = "end_date", nullable = false)
    private Timestamp endDate;

    @Column(name = "status", nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;
}
