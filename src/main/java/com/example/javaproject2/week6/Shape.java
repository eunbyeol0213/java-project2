package com.example.javaproject2.week6;

public interface Shape {
   // void run();
    double calculateArea();

    //기본적으로 인터페이스에 달려있는 메서드
    default void display(){
        System.out.println("디폴트 메서드");
    }

    double calculatePerimeter();
}
