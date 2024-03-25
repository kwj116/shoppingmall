package com.shoppingmallproject.domain;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Enquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enquiry_number", nullable = false)
    private int enquiryNumber;

    @Column(name = "enquiry_title", nullable = false)
    private String enquiryTitle;

    @Column(name = "enquiry_content", nullable = false, columnDefinition = "Text")
    private String enquiryContent;

    //FK : User
    private int userId;

    @Column(name = "create_date", nullable = false)
    private Timestamp createDate;

    @Column(name = "modify_date", nullable = false)
    private Timestamp modifyDate;
}
