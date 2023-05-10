package com.example.javaproject2.week4;

public class ParallelogramDrawer implements ShapeDrawer {

    @Override
    public void printShape(int h) {
        for (int i = 0; i < h ; i++) {
            System.out.println(makeALine(h,i));
        }
    }

    @Override
    public String makeALine(int h, int i) {

        String str = "";
        for (int j = 0; j < i; j++) {
            str += " ";
        }

        for (int j = 0; j < h; j++) {
            str += "*";
        }
        return str;

    }
}
