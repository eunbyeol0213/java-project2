package com.example.javaproject2.week4.day3;

import java.util.Scanner;

public class RhombusStar {

/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int pivot = height / 2;
        for (int i = 0; i < height; i++) {
            if (i <= pivot) {
                //피라미드
                System.out.printf("%s%s\n", "0".repeat(pivot - i), "*".repeat(2 * i + 1));
            } else {
                //역피라미드
                System.out.printf("%s%s\n", "0".repeat(i - pivot), "*".repeat(height - 2 * (i - pivot)));

            }
        }
    }*/

    //메소드 이용
    public static String getRepeatSymbol(String symbol, int n){
        return symbol.repeat(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int pivot = height / 2;
        for (int i = 0; i < height; i++) {
            if (i <= pivot) {
                //피라미드
                System.out.printf("%s%s\n", getRepeatSymbol(" ", pivot - i), getRepeatSymbol("*",2 * i + 1));
            } else {
                //역피라미드
                System.out.printf("%s%s\n", getRepeatSymbol(" ", i - pivot), getRepeatSymbol("*",2 * i + 1));

            }
        }
    }
}
