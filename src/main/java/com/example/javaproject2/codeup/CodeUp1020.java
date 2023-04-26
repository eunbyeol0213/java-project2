package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String socialSecurityNumber = sc.next();
        String front = socialSecurityNumber.substring(0,6);
        String back = socialSecurityNumber.substring(7);

        System.out.println(front + back);
    }
}
