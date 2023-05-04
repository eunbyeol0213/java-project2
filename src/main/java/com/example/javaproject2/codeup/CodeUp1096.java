package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stoneCount = sc.nextInt();
        int[][] checkerboard = new int[19][19];

        for (int i = 0; i < stoneCount; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            checkerboard[x - 1][y - 1] = 1;
        }


        for(int i =0; i < checkerboard.length; i++){
            for (int j = 0; j < checkerboard.length; j++){
                System.out.print(checkerboard[i][j] + " ");
            }
            System.out.println();
        }
        }
    }


