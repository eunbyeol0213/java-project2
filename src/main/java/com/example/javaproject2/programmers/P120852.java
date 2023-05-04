package com.example.javaproject2.programmers;

import java.util.ArrayList;
import java.util.List;

public class P120852 {
    //소인수분해
    //방법 1
    public int[] solution(int n){
        List<Integer> list = new ArrayList<>();

        for (int i= 2; i <= n; i++){
            //나누어 떨어지면 i는 소인수
            //몫이 2 이상인 경우도 있기 때문에 안 나눠질때까지 반복
            if(n % i == 0){
                while(n % i ==0){
                    n /= i;
                }
                list.add(i);    //구한 소인수를 list에 넣어줌
            }
        }

        int[] answer = new int[list.size()];    //소인수 갯수와 같은 길이로 설정
        //list 값들을 answer 배열에 넣어줌
        for(int i = 0; i <list.size(); i ++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    //방법 2
    public static void main(String[] args) {
        int n = 12;
        int divisor=2;

        int[] arr = new int[n + 1];

        while(n > 1){
            if(n % divisor == 0){
                arr[divisor] = divisor;
                n /= divisor;
            } else{
                // 12 /2 = 6 /2 = 3 /2 은 2로 나누어 떨어지지 않음
                divisor++;
            }
        }

        //0이 아닌 숫자의 개수 O(n)
        int size = 0;
        for (int i  = 0; i< arr.length; i++){
            if(arr[i] != 0){
                size++;
            }
        }

        //0이 아닌 숫자를 앞에부터 넣기 o(n)
        int[] answer = new int[size];
        int idx = 0;
        for(int i = 0; i < arr.length; i++){

        }
    }

}
