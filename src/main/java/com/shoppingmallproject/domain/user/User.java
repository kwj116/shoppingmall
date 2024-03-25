package com.shoppingmallproject.domain.user;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @Column(name = "user_id", nullable = false, unique = true)
    private String userId;

    @Column(name = "user_pw", nullable = false)
    private String userPw;

    @Column(name = "user_name", nullable = false)
    private String username;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "user_info_id")
    private Long userInfoId;
}
