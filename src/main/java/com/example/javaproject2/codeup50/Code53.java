package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bol = sc.nextInt();
        if (bol > 0) bol = 0;
        else bol = 1;
        System.out.printf("%d",bol);
    }
}
