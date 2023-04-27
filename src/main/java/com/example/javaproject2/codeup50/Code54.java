package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int answer = 1;
        if(num1 == 0 || num2 == 0){
            answer = 0;
        }
        System.out.println(answer);
    }
}
