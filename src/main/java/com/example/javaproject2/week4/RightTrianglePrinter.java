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
        RightTrianglePrinter p1 = new RightTrianglePrinter(new ConsolePrinter());
        p1.printer.print();
        RightTrianglePrinter p2 = new RightTrianglePrinter(new FilePrinter());
        p2.printer.print();
    }
}
