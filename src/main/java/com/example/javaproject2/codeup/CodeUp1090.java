package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a =sc.nextLong();
        long r =sc.nextLong();
        long n =sc.nextLong();


        long result = a * (long)(Math.pow(r, n-1));
        System.out.printf("%d\n", result);
    }
}
