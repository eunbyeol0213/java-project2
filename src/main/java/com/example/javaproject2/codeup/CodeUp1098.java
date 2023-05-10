package com.example.javaproject2.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1098 {
    private int[][] arr;

    // m * n 크기의 배열 생성하는 기능
    public CodeUp1098(int rowCnt, int colCnt) {
        this.arr = new int[rowCnt][colCnt];
    }

    //막대를 놓는 기능
    public void setBeam(int l, int direction, int x, int y){
        for (int i = 0; i < l; i++){
            if(direction == 0){ //가로
                arr[x - 1][y + i - 1] = 1;
            } else {    //세로
                arr[x + i - 1][y - 1] = 1;
            }
        }
    }

    //배열을 출력하는 기능
    public void printArr(){
        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowCnt = sc.nextInt();
        int colCnt = sc.nextInt();
        CodeUp1098 codeUp1098 = new CodeUp1098(rowCnt, colCnt);

        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++){
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            codeUp1098.setBeam(l, d, x, y);
            codeUp1098.printArr();
        }

    }
}
