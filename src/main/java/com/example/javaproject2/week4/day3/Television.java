package com.example.javaproject2.week4.day3;

public class Television implements RemoteControl{
    //필드
    private int volume;

    //turnOn() 추상 메소드의 실체 메소드
    @Override
    public void turnOn() {
        System.out.println("TV를 키다");
    }

    //turnOff() 추상 메소드의 실체 메소드
    @Override
    public void turnOff() {
        System.out.println("TV를 끄다");
    }

    //setVolume() 추상 메소드의 실체 메소드
    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }
}
