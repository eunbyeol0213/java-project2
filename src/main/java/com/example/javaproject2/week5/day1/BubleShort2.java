package com.example.javaproject2.week5.day1;

import java.util.Arrays;

public class BubleShort2 {
    public int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;
    }
    public static void main(String[] args) {
        BubleShort2 bubleShort2 = new BubleShort2();
        int[] arr = {7, 2, 3, 9, 28, 11};
        arr = bubleShort2.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
