package com.shoppingmallproject.domain;

import com.shoppingmallproject.domain.user.User;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Enquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enquiry_number", nullable = false)
    private Long enquiryNumber;

    @Column(name = "enquiry_title", nullable = false)
    private String enquiryTitle;

    @Column(name = "enquiry_content", nullable = false, columnDefinition = "Text")
    private String enquiryContent;

    @Column(name = "create_date", nullable = false)
    private Timestamp createDate;

    @Column(name = "modify_date", nullable = false)
    private Timestamp modifyDate;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @OneToOne(mappedBy = "enquiry")
    private Answer answer;
}
