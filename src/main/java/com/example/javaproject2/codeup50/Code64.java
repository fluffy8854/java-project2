package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.printf("%d",(num1 < num2 ? num1 : num2) < num3 ? (num1<num2 ? num1:num2) : num3 );

    }

}
