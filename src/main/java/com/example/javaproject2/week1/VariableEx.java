package com.example.javaproject2.week1;

import com.example.javaproject2.PrintHello;

public class VariableEx {
    public static void main(String[] args) {
        int iVal ; // 정수타입 변수 선언
        iVal = 1;  // iVal을 1로 초기화

        PrintHello ph ; // 참조 타입 변수 선언
        ph = new PrintHello(); // new를 이용한 참조타입 변수 초기화

        System.out.println(iVal);
        ph.print();

    }
}
