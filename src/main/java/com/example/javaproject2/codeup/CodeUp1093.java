package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int callNum = sc.nextInt();
        int[] arr = new int[24];

        for(int i = 0; i <callNum; i++){
            //배열 값을 1씩 증가 시킴
            arr[sc.nextInt()]++;
        }

        for(int i = 1; i < arr.length; i++){
            System.out.printf("%d ", arr[i]);
        }
    }

}
