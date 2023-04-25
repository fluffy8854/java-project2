package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Code45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long num1 = sc.nextLong();
        Long num2 = sc.nextLong();

        System.out.printf("%d\n",num1+num2);
        System.out.printf("%d\n",num1-num2);
        System.out.printf("%d\n",num1*num2);
        System.out.printf("%d\n",num1/num2);
        System.out.printf("%d\n",num1%num2);
        System.out.printf("%.2f\n",num1/(float)num2);
    }
}
