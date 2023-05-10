package com.example.javaproject2.week4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class FilePrinter2 implements Printer2 {

    @Override
    public void print(String message) throws IOException {
        BufferedWriter bf = new BufferedWriter(new FileWriter("./hello.txt"));
        bf.append(message);
        bf.flush();
        bf.close();
    }
}
