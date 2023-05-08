package com.example.javaproject2.CodeupEtc;

import java.util.Scanner;

public class Code1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i < 10 ; i++) {
            for (int j = 0; j < i ; j++) {
                for (int k = 0; k < num; k++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
