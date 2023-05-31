package com.example.javaproject2.week7.day1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        printCheckLeapYear();
    }

    private static void printCheckLeapYear() {
        int i = 1700;
        if(checkLeapYear(i)){
            System.out.println(i + " O");
        }else {
            System.out.println(i + " X");
        }
    }

    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
/*        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            //System.out.println(year + " O");
            return true;
        }else {
            //System.out.println(year + " X");
            return false;
        }*/
    }

    public static boolean isLeapYear(int year) {
        if (year % 100 == 0) return false;
        if (year % 4 == 0) return true;
        return false;
    }
}
