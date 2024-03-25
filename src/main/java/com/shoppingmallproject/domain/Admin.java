package com.shoppingmallproject.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.checkerframework.checker.units.qual.C;

@Entity
public class Admin {
    @Id
    @Column(name = "admin_id", nullable = false)
    private String adminId;

    @Column(name = "admin_pw", nullable = false)
    private String adminPw;

    @Column(name = "admin_name", nullable = false)
    private String adminname;


}
