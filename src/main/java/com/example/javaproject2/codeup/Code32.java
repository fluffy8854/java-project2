package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Code32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hex = sc.nextInt();
        // 16진수 정수의 포맷 --> %x hexadecimal
        System.out.printf("%x", hex);

    }
}
