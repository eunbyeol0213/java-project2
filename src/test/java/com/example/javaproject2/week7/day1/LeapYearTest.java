package com.example.javaproject2.week7.day1;

import com.example.javaproject2.week7.day1.LeapYear;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void checkLeapYear() {
        //LeapYear.checkLeapYear(1700);

        //assertEquals: 같아야 한다
        assertEquals(false, LeapYear.checkLeapYear(1700));
    }
    @Test
    void testLeapYeat(){
        assertEquals(true, LeapYear.isLeapYear(2020));
        assertEquals(false, LeapYear.isLeapYear(1900));

    }
}