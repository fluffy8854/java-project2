package com.example.javaproject2.week2;

public class MinutSecond {
    public static void main(String[] args) {
        int seconds = 239;
        int minute = seconds / 60;
        int remainSec = seconds % 60;

        System.out.printf("%d 초는 %d 분 %d 초 입니다.",seconds,minute,remainSec);
    }
}
