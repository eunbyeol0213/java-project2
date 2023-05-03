package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = sc.nextLong();
        long h = sc.nextLong();
        long b = sc.nextLong();
        //s가 크면 int 범위를 벗어나므로 long으로 선언

        double result = ( w * h * b) / 8388608;
        System.out.printf("%.2f MB\n", result);

    }
}
