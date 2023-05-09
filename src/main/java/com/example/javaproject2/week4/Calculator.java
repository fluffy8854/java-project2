package com.example.javaproject2.week4;

public class Calculator {
    public void plus(){
        System.out.println(1 + 1);
    }

    public void printPlusOne(int num){
        System.out.println(num + 1);
    }

    public void printPlus(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public static void printMinus(int num1, int num2){
        System.out.println(num1 - num2);
    }

    public static void main(String[] args) {
        printMinus(10,10);
        Calculator.printMinus(7,5);
        Integer.parseInt("30");
        Math.pow(2,5);
    }
}
