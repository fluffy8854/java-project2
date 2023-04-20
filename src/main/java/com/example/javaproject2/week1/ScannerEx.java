package com.example.javaproject2.week1;

import java.util.Scanner;

public class ScannerEx {

    public void readTwoNumbersAndPlus(){
        Scanner sc = new Scanner(System.in);
        // 두개의 입력을 받아 출력하기
        System.out.println("숫자 두 개를 입력해주세요.");
        System.out.printf("첫 번째 숫자 : ");
        //int n1 = sc.nextInt();
        System.out.println("입력하신 첫 번째 숫자 : "+ sc.nextInt());
        System.out.printf("두 번째 숫자 : ");
        //int n2 = sc.nextInt();
        System.out.println("입력하신 두 번째 숫자 : "+ sc.nextInt());
        //System.out.println("두 수의 합 : "+ (n1+n2));
    }
}
