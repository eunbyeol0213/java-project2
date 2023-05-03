package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userA = sc.nextInt();
        int userB = sc.nextInt();
        int userC = sc.nextInt();

        int day = 1;
        while(day % userA != 0 || day % userB != 0 ||day % userC != 0){
            day++;
        }
        System.out.println(day);

    }
}
