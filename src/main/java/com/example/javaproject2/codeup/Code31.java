package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Code31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oct = sc.nextInt();
        // 8진수 정수의 포맷 --> %o
        System.out.printf("%o", oct);

    }
}
