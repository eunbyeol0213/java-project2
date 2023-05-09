package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1671 {
    public String play(int user, int computer){
        //0 바위, 1 가위, 2 보
        if(user == 0 && computer == 1){
            return "win";
        } else if (user == 1 && computer == 2) {
            return "win";
        }else if (user == 2 && computer == 0) {
            return "win";
        }else if (user == computer) {
            return "tie";
        }else{
            return "lose";
        }
    }
    public static void main(String[] args) {
        CodeUp1671 codeUp1671 = new CodeUp1671();
        Scanner sc = new Scanner(System.in);
        System.out.println(codeUp1671.play(sc.nextInt(), sc.nextInt()));
    }

}
