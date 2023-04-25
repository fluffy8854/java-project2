package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Code41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char word = sc.next().charAt(0);
        int nw = (int)word+1;

        System.out.printf("%c",(char)nw);
    }
}
