package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int sum = 0;
        while (val > 0){
            sum += val % 10;
            val /= 10;
        }

        if(sum >= 10){
            int a = sum;
            while(a > 0){

            }
        }

        System.out.println(sum);

    }
}
