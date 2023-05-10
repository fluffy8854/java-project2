package com.example.javaproject2.week4;

public class HelloPrinter {
    public void print(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        HelloPrinter hp = new HelloPrinter();
        hp.print("Hello");
        hp.print("Bye");
    }
}
