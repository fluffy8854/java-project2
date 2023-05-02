package com.example.javaproject2.codeup50;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code84 {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < r ; i++) {
            for (int j = 0; j < g ; j++) {
                for (int k = 0; k < b ; k++) {
                    pw.println(i+" "+j+" "+k);
                }
            }
        }
        pw.println(r*g*b);
        pw.close();
    }
}

