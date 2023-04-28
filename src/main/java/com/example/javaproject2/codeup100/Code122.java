package com.example.javaproject2.codeup100;

import java.util.Scanner;

public class Code122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sec = sc.nextInt();

        System.out.printf("%d %d",sec/60 ,sec % 60);

    }
}
