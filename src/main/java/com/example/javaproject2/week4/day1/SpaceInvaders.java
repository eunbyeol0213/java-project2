package com.example.javaproject2.week4.day1;

public class SpaceInvaders {
    int location;   //멤버변수

    public void moveLeft(){
        location = location - 1;
    }

    public void moveRight(){
        location = location + 1;
    }
}
