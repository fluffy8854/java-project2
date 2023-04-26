package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Code47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // 비트 연산자 << , >> 2진수로 표현된 숫자를 1비트씩 옮김. << 2배 늘어남 , >> 반으로 나눔(나머지 x)

        System.out.println(num<<1);
    }
}
