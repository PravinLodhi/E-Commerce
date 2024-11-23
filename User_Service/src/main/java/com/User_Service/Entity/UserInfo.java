package com.User_Service.Entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserInfo {
    @Id
    private long userId;
    private String name;
    private String email;
    @Embedded
    private Address address;
    private String contactNO;

    public UserInfo() {
        super();
    }

    public UserInfo(String email, String name, long userId, String contactNO, Address address) {
        this.email = email;
        this.name = name;
        this.userId = userId;
        this.contactNO = contactNO;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getContactNO() {
        return contactNO;
    }

    public void setContactNO(String contactNO) {
        this.contactNO = contactNO;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
