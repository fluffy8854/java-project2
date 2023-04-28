package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch(month){
            case 1 : case 2 : case 12 :
                System.out.println("winter");
                break;
            case 3 : case 4 : case 5 :
                System.out.println("spring");
                break;
            case 6 : case 7 : case 8 :
                System.out.println("summer");
                break;
            case 9 : case 10 : case 11 :
                System.out.println("fall");
                break;
            default:
                System.out.println("에러");
                break;
        }

    }
}
