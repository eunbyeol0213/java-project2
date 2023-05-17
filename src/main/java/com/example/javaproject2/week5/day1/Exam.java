package com.example.javaproject2.week5.day1;

import java.io.IOException;
import java.io.InputStreamReader;

public class Exam {
    private int inum = 3;

    public Exam() {
        this.inum = inum;
    }

    public static void main(String[] args) throws IOException {
        int inum = 5;
        Exam e = new Exam();
        System.out.printf("%d %d\n", inum, e.inum);


    }
}
