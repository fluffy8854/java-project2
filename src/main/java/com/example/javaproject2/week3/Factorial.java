package com.example.javaproject2.week3;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int answer = 1;

        for (int i = n ; i>=1 ; i-- ){
            answer *= i ;
        }
        System.out.println(answer);
    }
}
