package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1097 {
    public static void printArr2(int[][] arr){
        for(int i = 1; i < arr.length; i++){
            for(int j =1; j < arr.length; j++){
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[20][20];

        for (int i = 1; i < 20; i++){
            for(int j = 1; j < 20; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int size = sc.nextInt();
        for (int i = 0; i < size; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            //행 뒤집기
            for(int j = 1; j <20; j++){
                arr[x][j] = arr[x][j] == 0 ? 1: 0;
            }
            //열 뒤집기
            for(int j = 1; j <20; j++){
                arr[j][y] = arr[j][y] == 0 ? 1: 0;
            }
        }
        printArr2(arr);
    }
}
