package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();


        printEvenOddSign(num1);


    }

    public static void printEvenOddSign(int num){

        if(num > 0){
            System.out.println("plus");
            if(num % 2 == 0){
                System.out.println("even");
            }
            else if( num % 2 == 1){
                System.out.println("odd");
            }
        }
        else if(num < 0){
            System.out.println("minus");
            if(Math.abs(num) % 2 == 0){
                System.out.println("even");
            }
            else if( Math.abs(num) % 2 == 1){
                System.out.println("odd");
            }
        }


    }
}
