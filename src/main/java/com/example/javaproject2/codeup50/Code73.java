package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        do{
            num = sc.nextInt();
            System.out.println(num);
            num = sc.nextInt();
        }while(num != 0);
    }
}
