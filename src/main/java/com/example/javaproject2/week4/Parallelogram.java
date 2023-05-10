package com.example.javaproject2.week4;

public class Parallelogram {

    ShapeDrawer sd ;
    public Parallelogram(ShapeDrawer sd){
        this.sd = sd;
    }




    public static void main(String[] args) {
        Parallelogram p = new Parallelogram( new ParallelogramDrawer() );
        p.sd.printShape(5);
    }
}
