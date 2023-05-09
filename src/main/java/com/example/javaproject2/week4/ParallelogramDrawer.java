package com.example.javaproject2.week4;

public class ParallelogramDrawer extends ShapeDrawer {

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
