package com.ecommerce.demo.dao.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name="favourite")
public class FavouriteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FAVOURITE_ID")
    private int userId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="user_id")
    private UserEntity user;

    @OneToMany(mappedBy = "favouriteEntity")
    @JsonManagedReference
    private Set<ItemEntity> item;
}
