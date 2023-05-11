package com.example.javaproject2.week4.day3;

/*public class RightTriangleDraw {
    public String makeALine(int h, int i){
        return String.format("%s%s\n", " ".repeat(h - i), "*".repeat(2 * i -1));

    }
    public void printShape(){
        int h = 5;
        for (int i = 1; i <= h; i++){
            System.out.printf("%s%s\n", " ".repeat(h - i), "*".repeat(2 * i -1));
        }
    }
public void printShape(int height){
    int h = 5;
    for (int i = 1; i <= height; i++){
        System.out.printf("%s", makeALine(height, i));
    }
}

    public static void main(String[] args) {
        RightTriangleDraw rtd = new RightTriangleDraw();
        rtd.printShape(5);
    }
}*/

public abstract class ShapeDrawer2 {
    public abstract String makeALine(int h, int i);


    //도형을 출력하는 메소드
    public void printShape(int height){
        int h = 5;
        for (int i = 1; i <= height; i++){
            System.out.printf("%s", makeALine(height, i));
        }
    }

}
