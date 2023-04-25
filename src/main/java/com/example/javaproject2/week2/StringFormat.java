package com.example.javaproject2.week2;

public class StringFormat {
    public static void main(String[] args) {
        String name = "임지양";
        int balance = 10000;
        // printf의 출력 처럼 나오는 문자열을 반환해주는 함수 String.format
        String message = String.format(" %s님의 통장잔고는 %d원 입니다", name,balance);
        System.out.println(message);
        }
}