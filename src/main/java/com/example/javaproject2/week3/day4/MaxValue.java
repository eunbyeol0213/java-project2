package com.example.javaproject2.week3.day4;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {2, 1, 31, 9, 7};
        int targerValue = arr[0];
        for (int i =1; i < arr.length; i++){
            if (targerValue < arr[i]){  //기존 값보다 클 경우 교환
                targerValue = arr[i];
            }
        }
        System.out.println(targerValue);
    }
}
