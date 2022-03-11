package com.example.LibraryManagementSystem.dto;

import javax.persistence.Column;
import java.io.Serializable;

public class User implements Serializable {

    private long userId;
    private String userName;
    private String address;
    private long phoneNumber;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User(long userId, String userName, String address, long phoneNumber) {
        this.userId = userId;
        this.userName = userName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public User(){

    }
}
