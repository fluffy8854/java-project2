package com.example.javaproject2.week3;

public class While687 {
    public static void main(String[] args) {
        int answer = 0;
        int n = 678;
        while(n > 0){
            answer += n%10;
            n /= 10;
        }

        System.out.println(answer);
    }
}
