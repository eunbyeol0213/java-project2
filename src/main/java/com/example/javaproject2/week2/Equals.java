package com.example.javaproject2.week2;

public class Equals {
    public static void main(String[] args) {
        System.out.println("GOLD" == "GOLD");

        String str1 = "GOLD";
        String str2 = "G";
        System.out.println(str1.substring(0,1) == str2);
        System.out.println(str1.substring(0,1).equals(str2));
    }
}
