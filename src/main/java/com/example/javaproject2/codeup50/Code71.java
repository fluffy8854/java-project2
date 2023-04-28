package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printInt(sc);

    }

    public static int printInt (Scanner sc){
        int num;
        num = sc.nextInt();
        if( num == 0) return 0;
        System.out.printf("%d\n",num);
        return printInt(sc);
    }
}
