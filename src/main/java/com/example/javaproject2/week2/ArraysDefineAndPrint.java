package com.example.javaproject2.week2;


import java.util.Arrays;

public class ArraysDefineAndPrint {
     public static void main(String[] args) {
         int[] iArr = new int[3];
         System.out.println(Arrays.toString(iArr));

         int[] iArr2 = new int[]{1, 2, 3, 8};
         System.out.printf("%d %d %d %d", iArr2[0], iArr2[1], iArr2[2], iArr2[3]);

         String[] sArr = new String[3];
         System.out.println(Arrays.toString(sArr));
        }
    }
