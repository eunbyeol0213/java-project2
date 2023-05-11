package com.example.javaproject2.week4.day3;

public interface RemoteControl {
   //상수 선언
   public int MAX_VOLUME = 10;
   public int MIN_VOLUME = 0;

   //추상 메소드
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);


}
