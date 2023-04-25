package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Code27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String[] ymd = time.split("\\.");

        int y,m,d;

        y = Integer.parseInt(ymd[0]);
        m = Integer.parseInt(ymd[1]);
        d = Integer.parseInt(ymd[2]);

        System.out.printf("%02d-%02d-%04d",d,m,y);

    }
}
