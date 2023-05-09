package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1361 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        for(int i = 1; i <= val; i++){
            for(int j = 0; j < i - 1; j++){
                System.out.print(" ");
            }
            System.out.println("**");
        }
    }
}
