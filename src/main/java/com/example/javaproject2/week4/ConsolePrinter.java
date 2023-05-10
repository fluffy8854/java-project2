package com.example.javaproject2.week4;

import java.io.IOException;

public class ConsolePrinter implements Printer{

    @Override
    public void print() throws IOException {
        String[] lines = printShape(5);
        for(int i = 0 ; i < lines.length ; i++){
            System.out.print(lines[i]);
        }
    }

    @Override
    public String[] printShape(int h) {
        String[] lines = new String[h];
        for(int i = 0 ; i < h ; i++){
            lines[i] = makeALine(i);
        }
        return lines;
    }

    public String makeALine( int i){
        return String.format("%s\n","*".repeat(i+1));
    }
}
