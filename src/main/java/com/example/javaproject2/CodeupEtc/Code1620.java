package com.example.javaproject2.CodeupEtc;

import java.util.Scanner;

public class Code1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = 0;
        do{
            mod = 0;
            while(n > 0){
                mod += n % 10;
                n /= 10;
            }

            n = mod;
        }while(n >= 10);

        System.out.println(n);
    }
}
