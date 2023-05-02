package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long s = sc.nextLong();

        long gop = h*b*c*s;

        System.out.printf("%.1f MB",gop/8388608.0);


    }
}
