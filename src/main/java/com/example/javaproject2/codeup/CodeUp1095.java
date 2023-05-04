package com.example.javaproject2.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        Integer[] arr = new Integer[size];

        for (int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[0]);

    }
}
