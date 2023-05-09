package com.example.javaproject2.week4;

public class PyramidDrawer extends ShapeDrawer {

    @Override
    public String makeALine(int h, int i) {
        String aLine = "";
        for (int j = 0; j < h - i; j++) {
            aLine += " ";
        }

        for (int j = 0; j < 2*i -1 ; j++) {
            aLine += "*";
        }

        return aLine;
    }
}
