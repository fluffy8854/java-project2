package com.example.javaproject2.week3;

public class MultiplicationTabel2 {
    public static void main(String[] args) {
        for( int i = 2; i <= 4 ; i++){
            for(int j = 1 ; j <=9 ; j++) {
                System.out.printf("%d * %d = %d\n",i, j, j*i);
            }
        }
    }
}
