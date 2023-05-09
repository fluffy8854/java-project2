package com.example.javaproject2.week4;

import static org.junit.jupiter.api.Assertions.*;

class ParallelogramDrawerTest {
    public static void main(String[] args) {
        ShapeDrawer sd = new PyramidDrawer();
        sd.printShape(5);

        ShapeDrawer sd2 = new ParallelogramDrawer();
        sd2.printShape(4);
    }

}