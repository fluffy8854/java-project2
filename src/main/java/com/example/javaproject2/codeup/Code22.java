package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Code22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "" ;
        do{
            word = word + " " + sc.next();
        }while(sc.hasNext());
        System.out.println(word);
    }
}
