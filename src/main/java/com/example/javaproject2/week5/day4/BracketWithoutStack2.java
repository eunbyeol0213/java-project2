package com.example.javaproject2.week5.day4;

import java.util.Arrays;

public class BracketWithoutStack2 {
    public static void main(String[] args) {
/*        String brackets = "(((())))";

        while(brackets.indexOf("()") != -1){
            //자른다
            String[] split = brackets.split("\\(\\)");
            System.out.println(Arrays.toString(split));

            //자른거 다시 합침
            brackets = String.join("", split);
            System.out.println(brackets);
        }*/

        String ex = "가나다라";
        System.out.println(ex.indexOf("나"));
        System.out.println(ex.indexOf("라"));
        System.out.println(ex.indexOf("마"));

    }
}
