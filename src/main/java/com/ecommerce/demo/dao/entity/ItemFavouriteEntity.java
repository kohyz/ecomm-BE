package com.ecommerce.demo.dao.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="item_favourite")
public class ItemFavouriteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEM_FAVOURITE_ID")
    private int itemFavouriteId;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="user_id")
    private UserEntity user;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="item_id")
    private ItemEntity item;
}
