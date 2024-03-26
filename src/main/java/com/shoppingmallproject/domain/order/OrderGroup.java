package com.shoppingmallproject.domain.order;

import com.shoppingmallproject.domain.user.User;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
public class OrderGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_group_number", nullable = false)
    private Long orderGroupNumber;

    @OneToMany(mappedBy = "orderGroup")
    private List<Order> order;

    @Column(name = "order_date", nullable = false)
    private Timestamp orderDate;

    @Column(name = "del_addr", nullable = false)
    private String delAddress;

    @Column(name = "reward")
    private int reward;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;
}
