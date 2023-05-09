package com.example.javaproject2.week4.day1;

public class SumOfFactors {
    int sumOfFactors(int num){
        int answer = 1;
        for (int i = 2; i <= num; i++){
            if (num % i == 0) answer += i;
        }
        return answer;
    }

    void printResult(int num){
        System.out.printf("%d의 약수의 합은 %d입니다.\n", num, sumOfFactors(num));
    }

    public static void main(String[] args) {
        SumOfFactors sumOfFactors = new SumOfFactors();
        sumOfFactors.printResult(12);
        sumOfFactors.printResult(36);
        sumOfFactors.printResult(48);
        sumOfFactors.printResult(29);

    }
}

