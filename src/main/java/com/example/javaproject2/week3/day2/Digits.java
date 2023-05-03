package com.example.javaproject2.week3.day2;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        int num = 3425;
        int digit = 0;
        while(num > 0){
            num /= 10;
            digit++;
        }
        System.out.println(digit);
    }
}
