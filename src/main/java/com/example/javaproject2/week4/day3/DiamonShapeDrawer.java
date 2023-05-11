package com.example.javaproject2.week4.day3;

public class DiamonShapeDrawer extends ShapeDrawer2{
    public String getRepeatSymbol(String symbol, int n){
        String answer = "";
        for (int i = 0; i < n; i++){
            answer += symbol;
        }
        return answer;
    }
    @Override
    public String makeALine(int h, int i) {
        int pivot = h / 2;
            if (i <= pivot) {
                //피라미드
                return String.format("%s%s\n", getRepeatSymbol(" ", pivot - i), getRepeatSymbol("*",2 * i + 1));
            } else {
                //역피라미드
                return String.format("%s%s\n", getRepeatSymbol(" ", i - pivot), getRepeatSymbol("*",2 * i + 1));
            }
    }
}
