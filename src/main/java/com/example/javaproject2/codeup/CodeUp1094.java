package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int callNum = sc.nextInt();
        int[] arr = new int[callNum];
        for(int i = 0; i < callNum; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            System.out.printf("%d ", arr[arr.length - i - 1]);
        }
    }
}
