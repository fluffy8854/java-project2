package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Code34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Scanner 진수 선택하여 정수 입력 받기 --> nextInt 메서드의 index에 원하는 진수 입력
        int oct = sc.nextInt(8);

        System.out.printf("%d", oct);

    }
}
