package com.shoppingmallproject.domain;

import com.shoppingmallproject.domain.order.Order;
import com.shoppingmallproject.domain.order.OrderGroup;
import jakarta.persistence.*;

@Entity
public class ReturnItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "return_item_number", nullable = false)
    private Long returnItemNumber;


    @Column(name = "exchange", nullable = false)
    private Boolean exchange;

    @Column(name = "status", nullable = false)
    private Boolean status;

    @OneToOne
    @JoinColumn(name = "order_number", referencedColumnName = "order_number")
    private Order order;

    @OneToOne
    @JoinColumn(name = "order_group_number", referencedColumnName = "order_group_number")
    private OrderGroup orderGroup;
}
