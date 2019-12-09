package com.hayparking.HayParkingBack.entities;

import org.springframework.data.annotation.Id;

/**
 * user
 */
public class User {

    @Id
    public String id;

    private String name;
    private String lastName;
    private String address;
    private String email;
    private String password;
    private String passwordConfirm;

    public User() {
    }

    public User(String name, String lastName, String address, String email, String password, String passwordConfirm) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

}