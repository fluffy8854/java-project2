package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Code46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long num1 = sc.nextLong();
        Long num2 = sc.nextLong();
        Long num3 = sc.nextLong();
        Long sum = num1 + num2 + num3;
        double avg = sum / 3.0;
        System.out.printf("%d\n",sum);
        System.out.printf("%.1f",avg);

    }
}
