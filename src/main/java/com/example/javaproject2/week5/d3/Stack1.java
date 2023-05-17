package com.example.javaproject2.week5.d3;

import java.util.Arrays;

public class Stack1 {

    private int[]  arr = new int [10000];
    private int pointer = 0;
    public Stack1(int size) {
        this.arr = new int[size];
    }

    public Stack1() {

    }

    public void push(int value){
         this.arr[pointer] = value;
         pointer++;
        System.out.println(pointer);
        System.out.println(Arrays.toString(this.arr));
    }

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push(10);

    }
}
