package com.example.javaproject2.week4;

public abstract class ShapeDrawer2 {

    public abstract String makeALine(int h, int i);
        //return String.format("%s%s\n", "0".repeat(h-i), "*".repeat(2 * i - 1));

    public void printShape(int h){
        for (int i = 0; i <= h ; i++) {
            System.out.printf("%s\n",makeALine(h,i));
        }
    }

}
