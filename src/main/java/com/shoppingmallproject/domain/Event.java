package com.shoppingmallproject.domain;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id", nullable = false)
    private int eventId;

    @Column(name = "event_type", nullable = false)
    private String eventType;

    //FK : Category
    private int categoryNumber;
    @Column(name = "discount_amount", nullable = false)
    private int discountAmount;

    @Column(name = "event_title", nullable = false)
    private String eventTitle;

    @Column(name = "event_content", nullable = false, columnDefinition = "Text")
    private String eventContent;

    @Column(name = "start_date", nullable = false)
    private Timestamp startDate;

    @Column(name = "end_date", nullable = false)
    private Timestamp endDate;

    @Column(name = "event_img_url", nullable = false, columnDefinition = "Text")
    private String eventImgUrl;
}
