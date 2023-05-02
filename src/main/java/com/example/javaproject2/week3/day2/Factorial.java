package com.example.javaproject2.week3.day2;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int answer = 1;     //'곱'해야 되기 때문에 초기값은 1로 지정
        for (int i = 1; i <= n; i++){
            answer *= i;
        }
        System.out.println(answer);
    }
}
