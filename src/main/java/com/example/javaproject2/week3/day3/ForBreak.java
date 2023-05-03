package com.example.javaproject2.week3.day3;

public class ForBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if(i == 5){
                break;
            }
            System.out.printf("%d\n", i);
        }
    }
}
