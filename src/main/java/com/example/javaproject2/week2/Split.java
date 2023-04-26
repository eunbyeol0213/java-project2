package com.example.javaproject2.week2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
/*
        String str = " 10 3 19 28 7 488";
        String[] arr = str.split(" ");

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
*/


        String str = "10.3.19.28.7.488";
        String[] arr1 = str.split(".");
        String[] arr2 = str.split("\\.");

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));



    }
}
