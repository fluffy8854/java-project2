package com.example.javaproject2.week2;

import java.util.Scanner;

public class Promotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int prj = sc.nextInt();

        if( year > 5 || prj > 10){
            System.out.println("팀장 승진 대상입니다.");
        }
        else System.out.println("팀장 승진 대상이 아닙니다.");
    }
}
