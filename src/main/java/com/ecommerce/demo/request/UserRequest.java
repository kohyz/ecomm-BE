package com.ecommerce.demo.request;

import lombok.Data;

@Data
public class UserRequest {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
}
