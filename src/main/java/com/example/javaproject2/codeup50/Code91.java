package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long m = sc.nextInt();
        long d = sc.nextInt();
        long n = sc.nextInt();



        for(int i = 1 ; i < n ; i ++){
            a = a *(m) + d ;
        }
        System.out.println(a);
    }
}
