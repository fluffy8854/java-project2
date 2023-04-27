package com.example.javaproject2.week2;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;

        while(num > 0){
            answer += num % 10;   // answer = 0 + 7
            num = num / 10;       // num = 67
            //System.out.printf("num:%d, answer:%d\n", num, answer);
        }

        System.out.printf("num:%d, answer:%d\n", num, answer);

    }

}
