package com.example.javaproject2.week4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RightTrianglePrinter {
    private Printer printer;

    public RightTrianglePrinter(Printer printer){
        this.printer = printer;
    }


    public static void main(String[] args) throws IOException {
        Printer p1 = new ConsolePrinter();
        p1.print();
        Printer p2 = new FilePrinter();
        p2.print();
    }
}
