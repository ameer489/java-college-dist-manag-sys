package com.example.demo.models;

import org.apache.catalina.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;


public class StusentProfile {
    
@Entity
public class StudentProfile {

    @Id
    private Long userId;

    @SuppressWarnings("unused")
    private String photo;
    @SuppressWarnings("unused")
    private String year;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Getters and setters
}
}
