package com.example.javaproject2.week2;

public class StringFormat {
    public static void main(String[] args) {
        String name= "고은별";
        int balance = 10000;

        System.out.printf("%s님의 통장 잔고는 %d원 입니다.\n", name, balance);

        String result = String.format("%s님의 통장 잔고는 %d원 입니다.",name, balance);
        System.out.println(result);

        int i = 10;

        String binaryString = Integer.toBinaryString(i); //2진수
        String octalString = Integer.toOctalString(i);   //8진수
        String hexString = Integer.toHexString(i);       //16진수

        System.out.println(binaryString);
        System.out.println(octalString);
        System.out.println(hexString);

        System.out.printf("%x", i);
        System.out.printf("%X", i);

    }
}
