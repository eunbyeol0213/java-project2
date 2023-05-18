package com.example.javaproject2.week5.day3;

import java.util.EmptyStackException;

public class Stack1 {
    int[] arr = new int[10000];
    int pointer = 0;

    //value를 받아 arr에 넣는 기능
    public void push(int value){
        this.arr[pointer++] = value;
//        System.out.println(pointer);
    }
    //꺼내고 ponter를 줄이는 기능
    public int pop(){
/*        int temp = this.arr[pointer - 1];
        pointer--;
        return temp;*/
        if(isEmpty()) throw new EmptyStackException();
        return this.arr[--pointer];
    }

    //stack이 비었는지 확인하는 기능
    public boolean isEmpty(){
        return this.pointer == 0;
    }

    public int peek(){
        if(isEmpty()) throw new EmptyStackException();
        return this.arr[pointer - 1];
/*        push(10);
          인덱스  0 1
          arr[] 10 0
          -> 인덱스가 1 일때 pointer = 1
          */
    }

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push(10);
        System.out.println(st.pop());
        st.push(20);
        System.out.println(st.peek());
    }
}
