package com.ecommerce.demo.dao.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name="item")
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private int userId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESC")
    private String desc;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "IMAGE_URL")
    private String imageUrl;

    @Column(name = "PRICE")
    private double price;

    @Column(name = "QUANTITY")
    private int quantity;

    @OneToMany(mappedBy = "itemEntity")
    @JsonManagedReference
    private Set<CartItemsEntity> cartItems;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="user_id")
    private UserEntity user;
}
