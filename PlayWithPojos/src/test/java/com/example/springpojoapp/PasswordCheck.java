package com.example.springpojoapp;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordCheck {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String hashedPassword = "$2a$10$W92uyesczudjdYURrAieUOkTGTyVzrPABsx/tsuLQzEYouU84swJS";
        String plainPassword = "password123";

        boolean isMatch = encoder.matches(plainPassword, hashedPassword);
        System.out.println("Şifre eşleşiyor mu? " + isMatch);
    }
}
