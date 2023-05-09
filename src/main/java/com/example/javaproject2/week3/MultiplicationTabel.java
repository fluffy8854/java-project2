package com.example.javaproject2.week3;

public class MultiplicationTabel {
    public static void main(String[] args) {
        printMultipleication(2);
        printMultipleication(3);
        printMultipleication(5);
        printMultipleication(7);
    }

    public static void printMultipleication(int dan){
        for( int i = 1; i <= 9 ; i++){
            System.out.printf("%d * %d = %d\n", dan, i, dan*i);
        }
    }
}
