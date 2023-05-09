package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        for (int i = 1; i <= val; i++) {
            for (int j = val - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= val; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
