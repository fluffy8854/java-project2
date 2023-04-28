package com.example.javaproject2.week2;

import java.util.Arrays;

public class AutoSwap {
    public static void main(String[] args) {
        int[]arr = {2,1,7,9};
        int temp;
        boolean check = arr[0] > arr[1];
        if(check){
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
