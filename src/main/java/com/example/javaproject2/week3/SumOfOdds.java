package com.example.javaproject2.week3;

public class SumOfOdds {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1 ; i < 10 ; i += 2 ){
            sum += i ;
        }
        System.out.println(sum);
    }
}
