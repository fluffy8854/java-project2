package com.example.javaproject2.week3;

import java.util.Scanner;

public class isZeroOrFive {

    public static boolean isZeroFive(int num){
        int cnt = 0;
        int mod = 0;

        while(num > 0){

            mod = num % 10;
            if(mod % 5 != 0 ){
                return false;
            }

            num /= 10;
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.printf("결과는 %b 입니다",isZeroFive(num));



    }
}
