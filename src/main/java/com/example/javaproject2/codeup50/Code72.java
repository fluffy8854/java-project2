package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printInt(sc,n);
    }

    public static int printInt (Scanner sc, int n){
        int num;
        num = sc.nextInt();
        if( n == 0) return 0;
        System.out.printf(" %d : %d\n",n,num);
        return printInt(sc, n-1);
    }
}
