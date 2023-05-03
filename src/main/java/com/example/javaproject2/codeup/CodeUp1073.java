package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*        while (true){
            int val = sc.nextInt();
            if(val != 0){
                System.out.println(val);
            } else {
                break;
            }
        }*/

        //do-while 문
        int val;
        do{
            val = sc.nextInt();
            if(val != 0) System.out.println(val);
        }while(val != 0);
    }
}
