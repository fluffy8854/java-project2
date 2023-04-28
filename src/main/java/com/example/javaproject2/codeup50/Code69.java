package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        switch(input.charAt(0)){
            case 'A':
                System.out.println("best!!!");
                break;
            case 'B':
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly~");
                break;
            default :
                System.out.println("what?");
                break;
        }

    }
}
