package com.shoppingmallproject.domain;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_number", nullable = false)
    private Long answerNumber;

    @Column(name = "answer_content", nullable = false, columnDefinition = "Text")
    private String answerContent;

    @Column(name = "create_date", nullable = false)
    private Timestamp createDate;

    @Column(name = "modify_date", nullable = false)
    private Timestamp modifyDate;

    @OneToOne
    @JoinColumn(name = "enquiry_number", referencedColumnName = "enquiry_number")
    private Enquiry enquiry;
}
