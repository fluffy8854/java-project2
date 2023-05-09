package com.example.javaproject2.week4;

import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {


            if (i <= num / 2 -1) {
                for (int j = (num-1)/2  - i   ; j > 0 ; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                for (int j =num  - 2*i -1 ; j > 0 ; j--) {
                    System.out.print(" ");
                }
            } else if (i > num / 2 -1) {
                for (int j = 0; j < i - num/2 ; j++) {
                    System.out.print(" ");
                }

                for (int j = 2*num - 2*i -1 ; j > 0; j--) {
                    System.out.print("*");
                }

                for (int j = 0; j < i - num/2 ; j++) {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }

    }
}

