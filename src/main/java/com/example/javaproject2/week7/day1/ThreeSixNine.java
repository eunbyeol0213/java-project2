package com.example.javaproject2.week7.day1;

public class ThreeSixNine {
    public static void main(String[] args) {
        threeSixNine("33");
        is369(89);
    }

    public static String is369(int cnt) {
/*        //십의 자리
        int a = cnt / 10;
        //일의 자리
        int b = cnt % 10;
        String str = "";
        if (a % 3 == 0 && a != 0) str += "*";
        if (b % 3 == 0 && b != 0) str += "*";
        return str;*/

        //재귀함수
        int a = cnt / 10;
        int b = cnt % 10;
        String str = (b % 3 == 0 && b != 0) ? "*" : "";
        if(a == 0)
            return str;
        //함수의 결과가 누적이 됨
        return str +is369(a);
    }

    private static void threeSixNine(String num) {
        String[] arr = num.split("");
        String star = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("3") || arr[i].equals("6") || arr[i].equals("9")){
                star += "*";
            }
        }
        System.out.println(star);
    }
}
