package com.ecommerce.demo.service;

import com.ecommerce.demo.dao.entity.UserEntity;
import com.ecommerce.demo.dao.repository.UserRepository;
import com.ecommerce.demo.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity addNewUser(UserRequest userDto) {
        UserEntity newUser = new UserEntity();
        newUser.setUserName(userDto.getUserName());
        newUser.setFirstName(userDto.getFirstName());
        newUser.setLastName(userDto.getLastName());
        newUser.setEmail(userDto.getEmail());
        newUser.setPassword(userDto.getPassword());
        UserEntity addedUser = userRepository.save(newUser);
        return addedUser;
    }

    public UserEntity authUser(UserRequest userDto) {
        UserEntity user = userRepository.findByUsernameAndPassword(userDto.getUserName(), userDto.getPassword());
        return user;
    }
}
