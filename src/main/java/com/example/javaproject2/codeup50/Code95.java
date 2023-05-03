package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int check;
        int min = 24;
        for(int i = 0 ; i < num ; i++){
            check = sc.nextInt();
            if( min > check) min = check;
        }
        System.out.println(min);
    }
}
