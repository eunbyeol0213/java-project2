package com.example.javaproject2.week6;

public interface Human extends Ani, Shape{
    @Override
    default void makeSound(){

    }
}
