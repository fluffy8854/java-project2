package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        printEvenOdd(num1);
        printEvenOdd(num2);
        printEvenOdd(num3);

    }

    public static void printEvenOdd(int num){

        if(num % 2 == 0) System.out.println("even");
        else if( num % 2 == 1) System.out.println("odd");
    }
}
