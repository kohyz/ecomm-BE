package com.ecommerce.demo.dao.repository;

import com.ecommerce.demo.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    public UserEntity findByUsernameAndPassword(String Username, String Password);
}
