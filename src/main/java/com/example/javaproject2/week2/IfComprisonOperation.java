package com.example.javaproject2.week2;

public class IfComprisonOperation {
    public static void main(String[] args) {
        int age = 20;
        boolean isAdult = age >=18;

        if(isAdult){
            System.out.println("성인입니다");
        }

        if(age < 18){
            System.out.println("미성년자 입니다");
        }
    }
}
