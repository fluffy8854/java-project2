package com.example.javaproject2.week5.d1;

import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] arr = {7,2,3,9,28,11};

        int j =0;
        for (int i = 0; i < arr.length -1; i++) {
            if(arr[j]> arr[i]){
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
