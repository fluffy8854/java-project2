package com.example.javaproject2.week1;

import java.util.Scanner;

public class ScannerAndVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 + num2);
        System.out.printf("%d와 %d의 합은 %d입니다.\n", num1, num2, num1+num2);
    }
}
