package com.example.javaproject2.codeup50;

import java.util.Scanner;

    public class Code76 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            char ch = sc.next().charAt(0);

            for(int i = 97 ; i <= (int)ch ; i++){
                System.out.println((char)i);
            }
    }
}
