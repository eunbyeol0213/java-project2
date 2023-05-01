package com.example.javaproject2.programmers;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diceA = sc.nextInt();
        int diceB = sc.nextInt();
        int diceC = sc.nextInt();
        if(diceA !=  diceB & diceB !=diceC & diceA != diceC){
            System.out.println(diceA + diceB + diceC);
        }
    }
}
