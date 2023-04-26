package com.example.javaproject2.week2;

import java.util.Arrays;

public class TwoDimArrSetValue {
    public static void printArray(int[][] arr){
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        printArray(arr);

        arr[0][0] =1 ; //0행 0열
        arr[1][0] = 2; //1행 0열
        arr[0][2] = 3; //0행 2열
        printArray(arr);

        arr[1][1] = 5; //0행 2열
        printArray(arr);

    }
}
