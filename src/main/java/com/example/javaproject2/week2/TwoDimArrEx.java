package com.example.javaproject2.week2;

import java.util.Arrays;



public class TwoDimArrEx {

    public static void printArr(int[][] arr){
        for(int i=0 ; i < 3 ; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("------------");
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        printArr(arr);

        arr[0][0] = 1;
        arr[0][2] = 2;
        arr[1][0] = 3;

        printArr(arr);

    }
}
