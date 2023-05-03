package com.example.javaproject2.codeup;


import java.util.Scanner;

public class CodeUp1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int factors = 0;  //약수의 개수

        for(int i =2; i < val; i++ ){
            if (val % i == 0) factors++;
        }

        System.out.println(factors == 0 ? "prime" : "not prime");

    }
}
