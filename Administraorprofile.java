package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "administrator_profile")
public class Administraorprofile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId; // Foreign key linking to the User entity

    private String photo; // URL or path to the administrator's profile photo

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department; // Foreign key linking to the Department entity

    // Default constructor
    public Administraorprofile() {
    }

    // Getters and Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
