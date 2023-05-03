package com.example.javaproject2.week3;

public class IsPrimeRoot {
    public static void main(String[] args) {
        int num = 1024;
        int factors = 0;
        for(int i = 2 ; i * i < num ; i++){
            if(num % i == 0){
                factors++;
            }
        }
        System.out.printf("%d의 factor : %d\n",num,factors);
        System.out.println(factors == 0 ? "소수입니다.":"소수가 아닙니다");

    }
}
