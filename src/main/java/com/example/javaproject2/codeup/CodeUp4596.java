package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];  //0번대는 비움

        for(int i =1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int xIndex = 0;
        int yIndex = 0;
        int targetValue = 0;    //자연수이므로 0으로 해도 가능
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                if(targetValue < arr[i][j]){
                    targetValue = arr[i][j];
                    xIndex = i;
                    yIndex = j;
                }
            }
        }
        System.out.println(targetValue);
        System.out.printf("%d %d", xIndex, yIndex);


    }

}
