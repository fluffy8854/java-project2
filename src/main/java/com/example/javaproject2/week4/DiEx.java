package com.example.javaproject2.week4;

public class DiEx {
    private ShapeDrawer shapeDrawer;

    public DiEx(){

    }

    public DiEx(ShapeDrawer sd){
        this.shapeDrawer =sd;
    }

    public void doSth(){
        shapeDrawer.printShape(5);
    }
}
