package com.example.javaproject2.week4;

public class PyramidDrawer implements ShapeDrawer {

    @Override
    public void printShape(int h) {
        for (int i = 0; i < h ; i++) {
            System.out.println(makeALine(h,i));
        }
    }

    @Override
    public String makeALine(int h, int i) {
        String aLine = "";
        for (int j = 0; j < h - i; j++) {
            aLine += " ";
        }

        for (int j = 0; j < 2*i +1 ; j++) {
            aLine += "*";
        }

        return aLine;
    }
}
