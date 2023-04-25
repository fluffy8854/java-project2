package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Code36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ch1 = sc.next();
        // char를 아스키코드로 나타내고 싶을 시 형변환으로 int형으로 바꾸어서 나타낸다.
        System.out.printf("%d",(int)ch1.charAt(0));

    }
}
