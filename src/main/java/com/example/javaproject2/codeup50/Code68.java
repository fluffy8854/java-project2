package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(100 >= num && num >= 90){
            System.out.println("A");
        }
        if(89 >= num && num >= 70){
            System.out.println("B");
        }
        if(69 >= num && num >= 40){
            System.out.println("C");
        }
        if(39 >= num){
            System.out.println("D");
        }
    }
}
