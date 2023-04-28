package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        printEven(num1);
        printEven(num2);
        printEven(num3);

    }

    public static void printEven(int num){

        if(num % 2 == 0) System.out.println(num);
    }
}
