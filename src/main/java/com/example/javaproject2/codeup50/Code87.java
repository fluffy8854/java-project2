package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(sum < num ){
            sum += i;
            i++;
        }
        System.out.println(sum);

    }
}
