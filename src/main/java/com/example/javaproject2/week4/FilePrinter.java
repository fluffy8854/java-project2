package com.example.javaproject2.week4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer{
    @Override
    public void print() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./aaa.txt"));
        String[] lines = printShape(5);
        for (int i = 0; i < lines.length ; i++) {
            bw.append(lines[i]);
        }
        bw.flush();
        bw.close();
    }

    @Override
    public String[] printShape(int h) {
        String[] lines = new String[h];
        for(int i = 0 ; i < h ; i++){
            lines[i] = makeALine( i);
        }
        return lines;
    }
    public String makeALine(int i){
        return String.format("%s\n","*".repeat(i+1));
    }
}
