package com.shoppingmallproject.domain.order;


import com.shoppingmallproject.domain.Coupon;
import com.shoppingmallproject.domain.Product;
import com.shoppingmallproject.domain.seller.Seller;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.sql.Timestamp;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "individual_order")
public class Order {

    @Id
    @Column(name = "order_number", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderNumber;

    @Column(name = "product_quantity", nullable = false)
    private int productQuantity;

    @Column(name = "is_cancelled", nullable = false)
    private Boolean isCancelled;

    @Column(name = "order_date", nullable = false)
    private Timestamp orderDate;

    @Column(name = "status", nullable = false)
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "seller_id", referencedColumnName = "seller_id")
    private Seller seller;

    @OneToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_number")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "order_group_id", referencedColumnName = "order_group_number")
    private OrderGroup orderGroup;

    @OneToOne
    @JoinColumn(name = "coupon_number", referencedColumnName = "coupon_number")
    private Coupon coupon;
}
