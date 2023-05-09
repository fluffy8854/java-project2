package com.example.javaproject2.week4;

public abstract class ShapeDrawer {

    public void printShape(int h){
        for (int i = 0; i < h ; i++) {
            System.out.println(makeALine(h,i));
        }
    }

    public abstract String makeALine(int h, int i);
}
