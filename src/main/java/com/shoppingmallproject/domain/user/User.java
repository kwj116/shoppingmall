package com.shoppingmallproject.domain.user;

import com.shoppingmallproject.domain.*;
import com.shoppingmallproject.domain.order.OrderGroup;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @Column(name = "user_id", nullable = false, unique = true)
    private String userId;

    @Column(name = "user_pw", nullable = false)
    private String userPw;

    @Column(name = "user_name", nullable = false)
    private String username;

    @Column(name="email", nullable = false, unique = true)
    private String email;

    @Column(name = "phone", nullable = false, unique = true)
    private String phone;

    //적립금 없을수도 있으니 null허용.
    @Column(name="reward")
    private int reward;

    @Column(name = "grade", nullable = false)
    @Enumerated(EnumType.STRING)
    private Role grade;

    @Column(name = "marketing_preferences", nullable = false)
    private Boolean marketingPreferences;

    @Column(name = "birth_date", nullable = false)
    private Timestamp birthDate;

    @Column(name = "signup_date", nullable = false)
    private Timestamp signupDate;

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<Cart> cartList = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<OrderGroup> orderGroupList = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<Coupon> couponList = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<Wish> whishList = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<Review> reviewList = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<Restock> restockList = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<DeliveryAddress> deliveryAddressList = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<RecentlyViewedProduct> recentlyViewedProductList = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<Enquiry> enquiryList = new ArrayList<>();
}
