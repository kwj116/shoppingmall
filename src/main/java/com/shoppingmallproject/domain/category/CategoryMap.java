package com.shoppingmallproject.domain.category;

import com.shoppingmallproject.domain.Product;
import jakarta.persistence.*;

@Entity
public class CategoryMap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_number", nullable = false)
    private Long categoryNumber;

    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    private Category category;

    @ManyToOne
    @JoinColumn(name = "product_number", referencedColumnName = "product_number")
    private Product product;
}
