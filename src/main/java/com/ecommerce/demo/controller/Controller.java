package com.ecommerce.demo.controller;

import com.ecommerce.demo.constant.ApplicationEndpoint;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = ApplicationEndpoint.TEST, method = RequestMethod.GET)
    public String test() { return "ok"; }
}
