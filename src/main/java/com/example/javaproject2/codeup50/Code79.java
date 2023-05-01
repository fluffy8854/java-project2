package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for( int i = 0 ; i >= 0 ;  i++){
            if ( word.charAt(0) == 'q'){
                System.out.println("q");
                break;
            }
            System.out.printf("%s\n", word);
            word = sc.next();

        }
    }
}
