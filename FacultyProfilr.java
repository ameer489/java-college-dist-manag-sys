package com.example.demo.models;


import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
@Entity
public class FacultyProfilr {
     @Id
    private Long userId;

    @SuppressWarnings("unused")
    private String photo;
    @SuppressWarnings("unused")
    private String officeHours;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
