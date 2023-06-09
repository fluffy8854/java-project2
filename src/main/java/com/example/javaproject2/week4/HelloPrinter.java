package com.example.javaproject2.week4;

import java.io.IOException;

public class HelloPrinter {
    Printer2 printer;

    public HelloPrinter(Printer2 printer) {
        this.printer = printer;
    }

    public void repeatMessage(int n, String message) throws IOException {
        for (int i = 0; i < n ; i++) {
            printer.print(message);
        }
    }


    public static void main(String[] args) throws IOException {
        HelloPrinter hp = new HelloPrinter(new ConsolePrinter2());
        hp.repeatMessage(5,"Hello");
        HelloPrinter hp2 = new HelloPrinter(new FilePrinter2());
        hp2.repeatMessage(5,"Hello");
    }
}
