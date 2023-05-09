package com.example.javaproject2.week4.day1;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name ="고은별";
        user1.age =26;

        User user2 = new User();
        user2.name = "짱아";
        user2.age = 9;

        System.out.printf("%s는 성인입니까? %s\n", user1.name, user1.isAdult());
        System.out.printf("%s는 성인입니까? %s\n", user2.name, user2.isAdult());

    }
}