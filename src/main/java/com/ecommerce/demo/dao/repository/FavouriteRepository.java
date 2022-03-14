package com.ecommerce.demo.dao.repository;

import com.ecommerce.demo.dao.entity.FavouriteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavouriteRepository extends JpaRepository<FavouriteEntity, Integer> {
}
