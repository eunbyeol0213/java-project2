package com.example.javaproject2.week4.day2;

public class ReversePyramid {
    public String spaceChar = "0";

    public ReversePyramid(String spaceChar) {

        this.spaceChar = spaceChar;
    }

    //메소드로 핵심기능 분리
    public String makeALine(int height, int i){
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(2 * (height- i) - 1));
    }
    public static void main(String[] args) {
        ReversePyramid reversePyramid = new ReversePyramid("");
        int height = 4;
        for (int i = 0; i < height; i++){
            //기존 로직을 메소드를 호출하기 위해 변경
            System.out.print(reversePyramid.makeALine(height , i));
     }

    }
}
