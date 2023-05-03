package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long s = sc.nextLong();
        //s가 크면 int 범위를 벗어나므로 long으로 선언

        double result = ( h * b * c * s) / 8388608.0;
        System.out.printf("%.1f MB\n", result);

    }
}
