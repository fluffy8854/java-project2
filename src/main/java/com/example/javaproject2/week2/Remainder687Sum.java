package com.example.javaproject2.week2;

public class Remainder687Sum {
    public static void main(String[] args) {
        int num = 687;
        int sc = num % 10;
        num /= 10;
        int min = num % 10;
        int hour = num / 10;
        System.out.println(sc+min+hour);
    }
}
