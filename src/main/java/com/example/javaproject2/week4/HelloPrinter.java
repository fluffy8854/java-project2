package com.example.javaproject2.week4;

public class HelloPrinter {
    Printer2 printer = new ConsolePrinter2();

    public void repeatMessage(int n, String message){
        for (int i = 0; i < n ; i++) {
            printer.print(message);
        }
    }


    public static void main(String[] args) {
        HelloPrinter hp = new HelloPrinter();
        hp.repeatMessage(5,"Hello");
    }
}
