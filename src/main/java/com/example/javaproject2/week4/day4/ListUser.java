package com.example.javaproject2.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        User user1 = new User("고은별", "010-1111-1111", 26);
        users.add(user1);

        User user2 = new User("짱아", "010-2222-2222", 8);
        users.add(user2);

        for (User user : users){
            System.out.printf("%s님의 전화번호는 %s입니다.\n",user.getName(), user.getPhoneNumber() );
        }
    }
}
