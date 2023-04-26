package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hour = sc.next();
        String[] arr = hour.split(":");

        System.out.println(arr[0] + ":" + arr[1]);
    }
}
