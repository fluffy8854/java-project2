package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; num > sum ; i++ ){
            sum += i;
            if(sum >= num) System.out.println(i);
        }
    }
}
