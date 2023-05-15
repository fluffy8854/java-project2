package com.example.javaproject2.week5.d1;

import java.util.Arrays;

public class BubbleSort1 {
    public static void main(String[] args) {
        int[] arr = {7,2,3,9,28,11};
        int tmp;

        for (int i = 0; i <arr.length -1 ; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
