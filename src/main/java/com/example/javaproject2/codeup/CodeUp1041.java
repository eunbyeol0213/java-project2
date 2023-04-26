package com.example.javaproject2.codeup;

import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp1041 {
    public static void main(String[] args) {
        //방법1
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        ch++;
        System.out.println(ch);

        //방법2
/*      InputStreamReader isr = new InputStreamReader(System.in);
        char c2 = (char)(isr.read() + 1);   //읽은 아스키코드에 +1을 하고 char로 강제 변경
        System.out.println(c2);*/
            }
}
