package com.example.javaproject2.CodeupEtc;

import java.util.Scanner;

public class Code1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean b = true;
        for(int i = 2 ; i < num ; i++){
            if(num % i == 0){
                b = false;
                break;
            }
        }
        System.out.println(b ? "prime" : "not prime");
    }
}
