package com.ecommerce.demo.dao.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name="cart")
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CART_ID")
    private int cartId;

    private double totalPrice;

    private Boolean isCheckedOut;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cartId", referencedColumnName = "userId")
    private UserEntity userEntity;

    @OneToMany(mappedBy = "cartEntity")
    @JsonManagedReference
    private Set<CartItemsEntity> cartItems;
}
