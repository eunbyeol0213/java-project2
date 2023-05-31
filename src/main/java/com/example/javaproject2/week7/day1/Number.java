package com.example.javaproject2.week7.day1;

import java.util.ArrayList;
import java.util.List;

public class Number {
    public static void main(String[] args) {

    }
    private static boolean isPrime(int num){
        for (int i = 0; i < num/2 ; i++) {

        }
        return false;
    }

    //완전수
    public static boolean PerpectionNumber(int num) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < num ; i++) {
            if (num % i == 0) numbers.add(i);
        }

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return (sum == num);
    }
}
