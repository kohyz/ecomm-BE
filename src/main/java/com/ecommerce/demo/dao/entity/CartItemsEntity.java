package com.ecommerce.demo.dao.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="cart_items")
public class CartItemsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CART_ITEMS_ID")
    private int cartItemsId;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="cart_id")
    private CartEntity cart;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="item_id")
    private ItemEntity item;
}
