package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Code33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hex = sc.nextInt();
        // 16진수 대문자 표현시 포멧 --> %X
        System.out.printf("%X", hex);

    }
}
