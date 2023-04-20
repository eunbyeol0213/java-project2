package com.example.javaproject2.week1.day4;

import com.example.javaproject2.PrintHello;

public class VariableEx {
    public static void main(String[] args) {
        int iVal;
        iVal = 0;//초기화: 최초로 값을 지정하는 것

        PrintHello printHello; //변수 선언
        // 변수 타입에는 원시타입, 참조타입 모두 가능
        printHello = new PrintHello();  //new를 이용해 인스턴스화 및 초기화
    }
}
