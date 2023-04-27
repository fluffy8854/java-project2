package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int answer = 1;
        if(num1 == 1 || num2 == 1){
            answer = 0;
            if(num1 == 1 && num2 == 1) answer = 1;
        }
        System.out.println(answer);
    }
}
