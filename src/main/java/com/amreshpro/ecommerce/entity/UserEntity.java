package com.amreshpro.ecommerce.entity;


import org.bson.types.ObjectId;

import java.util.Date;

@Entity(collection = "users")
public class UserEntity {
    private ObjectId id;
    private String name;
    private String email;
    private String password;
    private String role;
    private boolean isActive;
    private boolean isDeleted;
    private Date createdAt;
    private Date updatedAt;
    private String  lastLoginAt;
    private String  bio;
    private String  address;
    private String  city;
    private String  state;
    private String  zipcode;
    private String  phone;


}
