package com.example.javaproject2.programmers;

public class SumOfFactor {
    //약수의 합
    public static void main(String[] args) {
        int num = 6;
        int answer = 0;
        for(int i =1; i <= num; i++){
            if(num % i ==0) answer += i;
        }
        System.out.println(answer);
    }
}
