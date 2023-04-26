package com.example.javaproject2.week2;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2];    //배열의 초기화
        students[0] = new Student();    //Student 클래스의 초기화
        students[0].name = "고은별";   //Student 클래스 초기화 후 가능
        students[0].phoneNumber = "010-1111-1111";
        students[0].age = 26;
        students[1].name = "짱아";
        students[1].phoneNumber = "010-2222-2222";
        students[1].age = 9;
    }
}
