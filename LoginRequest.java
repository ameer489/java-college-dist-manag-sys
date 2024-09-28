package com.example.demo.controllers;

public class LoginRequest {
    private String username;
    private String password;
    private String role;  // Optional, depending on whether you need roles in the login request



    // Parameterized constructor
    public LoginRequest(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getters and Setters for username, password, and role

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
