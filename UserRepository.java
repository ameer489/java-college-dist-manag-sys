package com.example.demo.repositories;


import org.aspectj.apache.bcel.classfile.Module.Uses;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("unused")
public interface UserRepository extends JpaRepository<User, Long> {
    com.example.demo.models.User findByUsername(String username);
}
