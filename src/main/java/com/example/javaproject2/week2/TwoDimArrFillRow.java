package com.example.javaproject2.week2;

import java.util.Arrays;

public class TwoDimArrFillRow {
    public static void main(String[] args) {
/*        int[][] arr = new int[5][5];

        arr[2][0] = 1;
        arr[2][1] = 1;
        arr[2][2] = 1;
        arr[2][3] = 1;
        arr[2][4] = 1;

        for(int i=0; i<5; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        int[][] arrC = new int[5][5];
        arrC[0][2] = 1;
        arrC[1][2] = 1;
        arrC[2][2] = 1;
        arrC[3][2] = 1;
        arrC[4][2] = 1;

        for(int i=0; i<5; i++){
            System.out.println(Arrays.toString(arrC[i]));
        }*/
        int[][] arr = new int[5][5];
        fillARow(arr, 1);
        printTwoDimArr(arr);



    }

    public static void fillARow(int[][] arr, int roeNum){
        arr[roeNum][0] = 1;
        arr[roeNum][1] = 1;
        arr[roeNum][2] = 1;
        arr[roeNum][3] = 1;
        arr[roeNum][4] = 1;

    }

    public static void printTwoDimArr(int[][] arr){
        for(int i=0; i<5; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
