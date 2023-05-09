package com.example.javaproject2.week4.day1;

public class UserFactory {
    public User getAdultUser(){
        User user = new User();
        user.age = 26;
        return user;
    }
}
