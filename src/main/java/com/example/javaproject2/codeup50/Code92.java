package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int i = 1;
        while(true){
            if(i % num1 == 0 && i % num2 == 0 && i % num3 == 0){
                System.out.println(i);
                break;
            }
            i++;
        }

    }
}
