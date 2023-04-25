package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Code38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long num1 = sc.nextLong();
        Long num2 = sc.nextLong();
        // 정수 범위를 초과하는 숫자를 계산하고 싶을 때는 long 자료형을 사용한다.

        System.out.printf("%d",num1+num2);
    }
}
