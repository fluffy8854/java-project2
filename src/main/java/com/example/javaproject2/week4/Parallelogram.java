package com.example.javaproject2.week4;

public class Parallelogram {
    private String spaceChar = "0";

    public Parallelogram(String sc){
        this.spaceChar =sc;
    }

    public String makeALine (int height, int i ){
        String str = "";
        for (int j = 0; j < i ; j++) {
            str += " ";
        }

        for (int j = 0; j < height ; j++) {
            str += "*";
        }
        return str;
    }

    public void printParallelogram(int height){
        for (int i = 0; i < height ; i++) {
            System.out.println(makeALine(height,i));
        }
    }

    public static void main(String[] args) {
        Parallelogram p = new Parallelogram(" ");
        p.printParallelogram(10);
    }
}
