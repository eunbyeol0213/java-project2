package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int val = sc.nextInt();
            if(val != 0){
                System.out.printf("%d ", val);
            } else{
                break;
            }
        }
    }
}