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
         this.arr[pointer++] = value;
    }

    public int pop(){
        if(pointer == 0) return -1;
        return this.arr[--pointer];
    }

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push(10);
        System.out.println(st.pop());

    }
}
