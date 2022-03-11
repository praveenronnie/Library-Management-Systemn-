package com.example.LibraryManagementSystem.Entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity{
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column
    private String userName;

    @Column
    private String address;

    @Column
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


    public UserEntity(long userId, String userName, String address, long phoneNumber) {
        this.userId = userId;
        this.userName = userName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public UserEntity() {
    }

}
