package com.example.javaproject2.week6;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
/*        Box<Integer> box = new Box<>();
        box.setItem(10);*/
        //타입을 고정시키는 방법

        List<Integer> stringList = new ArrayList<>();
        stringList.add(1);
        stringList.add(2);

    }

    public <T> T getFirstItem(List<T> list){
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
}
