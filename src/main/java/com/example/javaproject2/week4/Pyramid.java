package com.example.javaproject2.week4;

import java.util.Scanner;

public class Pyramid {
    ShapeDrawer sd ;
    public Pyramid(ShapeDrawer sd){
        this.sd = sd;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Pyramid p = new Pyramid(new PyramidDrawer());
        p.sd.printShape(num);

    }
}
