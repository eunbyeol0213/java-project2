package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i =1; i <= n; i++ ){
            for (int j = 1; i <= m; j++){
                System.out.printf("%d %d\n", i, j);
            }
        }
    }
}
