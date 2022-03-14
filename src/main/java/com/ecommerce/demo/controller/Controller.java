package com.ecommerce.demo.controller;

import com.ecommerce.demo.dao.constant.ApplicationEndpoint;
import com.ecommerce.demo.dao.entity.UserEntity;
import com.ecommerce.demo.request.UserRequest;
import com.ecommerce.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    UserService userService;

    @RequestMapping(value = ApplicationEndpoint.TEST, method = RequestMethod.GET)
    public String test() { return "ok"; }

    @RequestMapping(value = ApplicationEndpoint.NEW_USER, method = RequestMethod.POST)
    public UserEntity addNewUser(@RequestBody UserRequest userRequest) {
        return userService.addNewUser(userRequest);
    }

    @RequestMapping(value = ApplicationEndpoint.AUTH_USER, method = RequestMethod.POST)
    public UserEntity authUser(@RequestBody UserRequest userRequest) {
        return userService.authUser(userRequest);
    }
}
