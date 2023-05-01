package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(16);

        for(int i = 1 ; i <= 0xF ; i++){
            System.out.printf("%X*%X=%X\n",n,i,n*i);
        }

    }
}
