package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++ ){
            if(i % 3 == 0){
                System.out.printf("X ");
            }
            else System.out.printf("%d ",i);
        }
    }
}
