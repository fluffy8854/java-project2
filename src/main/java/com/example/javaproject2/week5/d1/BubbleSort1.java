package com.example.javaproject2.week5.d1;

import java.util.Arrays;

public class BubbleSort1 {
    public static void main(String[] args) {
        int[] arr = {7,2,3,9,28,11};

        bubbleSort(arr);

        /*for (int i = 0; i <arr.length -1 ; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }*/
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length -1 -i ; j++) {
                sortARound(arr,j);
            }
        }
    }

    public static void sortARound(int[] arr, int i){
        if( arr[i] > arr[i+1]) {
            int tmp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = tmp;
        }
    }
}
