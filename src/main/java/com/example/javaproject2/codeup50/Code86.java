package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = sc.nextLong();
        long h = sc.nextLong();
        long b = sc.nextLong();


        System.out.printf("%.2f MB",(w*h*b)/8388608.0);
    }



}
