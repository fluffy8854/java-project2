package com.example.javaproject2.week5.d1;

import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] arr = {7,2,3,9,28,11};
        bubbleSort2(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort2(int[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            sortARound2(arr,i);
        }
    }

    public static void sortARound2(int[] arr, int i){
        for (int j = i+1; j < arr.length; j++) {
            if( arr[i] > arr[j]) {
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
            }
        }

    }
}
