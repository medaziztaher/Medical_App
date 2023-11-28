package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String username;
    private String email;
    private String profileImageUrl;
    private String role;
    private String password;
    // Constructor
    public User() {
        // Default constructor
    }

    public User(int userId, String username, String email, String profileImageUrl,String password,String role) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.profileImageUrl = profileImageUrl;
        this.password=password;
        this.role=role;
    }

    // Getters
    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getRole() {
        return role;
    }
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    // Setters
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public void setPassword(String password) {
        this.email = password;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }


}
