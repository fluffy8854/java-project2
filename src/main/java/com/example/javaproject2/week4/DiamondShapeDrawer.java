package com.example.javaproject2.week4;

public class DiamondShapeDrawer extends ShapeDrawer{

    @Override
    public String makeALine(int h, int i){
        String str = "";
        if(i <= h/2 -1){
            for(int j = (h - 1) / 2 - i ; j > 0 ; j--) str += " ";
            for (int j = 0; j < 2 * i + 1; j++) str += "*";
        }
        else{
            for (int j = 0; j < i - h / 2; j++) str += " ";
            for (int j = 2 * h - 2 * i - 1; j > 0; j--) str += "*";
        }

        return str;
    }

}
