package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 1; i < n  ; i++) {
            a = a + d;
        }
        System.out.println(a);
        //System.out.println(a+(n-1)*d);
    }
}
