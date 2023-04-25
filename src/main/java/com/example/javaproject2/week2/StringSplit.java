package com.example.javaproject2.week2;

import java.lang.reflect.Array;

public class StringSplit {
    public static void main(String[] args) {
        String str = "11 3 65 778 9544";
        String[] arr = str.split(" ");

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }


    }
}
