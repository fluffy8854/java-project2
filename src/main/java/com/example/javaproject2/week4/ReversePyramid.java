package com.example.javaproject2.week4;

import java.util.Scanner;

public class ReversePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num ; i++) {

            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*num - 2*i -1 ; j++) {
                System.out.print("*");
            }



            System.out.println("");
        }

    }
}
