package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Code48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int answer = num1 << num2; // num1 * 2의 num2승

        System.out.println(answer);

    }
}
