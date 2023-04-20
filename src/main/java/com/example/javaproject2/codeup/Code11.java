package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Code11 {
    public static void main(String[] args) {
        char x;
        Scanner sc = new Scanner(System.in);
        // Scanner는 char 자료형을 반환하는 함수가 없으므로 String을 반환하는 함수에 charAt함수를 사용
        x = sc.next().charAt(0);
        System.out.println(x);
    }
}
