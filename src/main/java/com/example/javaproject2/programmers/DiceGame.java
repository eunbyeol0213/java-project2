package com.example.javaproject2.programmers;

import java.util.Scanner;

public class DiceGame {
        public int solution(int a, int b, int c) {
            int answer = 0;

            if (a != b && b != c && a != c){
                answer = a + b + c;
            }

            else if (a == b && a == c && b == c) {
                answer = (a + b + c) * (a*a + b*b + c*c)  * (a*a*a + b*b*b + c*c*c);
            }

            else{
                answer = (a + b + c) * (a*a + b*b + c*c);
            }
            return answer;
        }


}
