package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printInt(sc,n-1);
    }

    public static int printInt (Scanner sc, int n){
        int num;
        num = sc.nextInt();
        System.out.printf("%d\n",num);
        if( n == 0) return 0;
        // 재귀 함수 이용
        return printInt(sc, n-1);
    }
}
