package com.example.javaproject2.CodeupEtc;

import java.util.Scanner;

public class Code1367 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < num; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
