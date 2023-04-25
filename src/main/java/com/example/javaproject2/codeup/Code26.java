package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Code26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h,m,s;
        String time =sc.next();
        String[] hms = time.split(":");
        h = Integer.parseInt(hms[0]);
        m = Integer.parseInt(hms[1]);
        s = Integer.parseInt(hms[2]);

        System.out.println(m);
    }
}
