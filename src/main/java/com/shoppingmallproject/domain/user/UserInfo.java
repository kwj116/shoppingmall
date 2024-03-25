package com.shoppingmallproject.domain.user;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userInfoId;

    @Column(name="email", nullable = false, unique = true)
    private String email;

    @Column(name = "phone", nullable = false, unique = true)
    private String phone;

    //적립금 없을수도 있으니 null허용.
    @Column(name="reward", nullable = true)
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

}
