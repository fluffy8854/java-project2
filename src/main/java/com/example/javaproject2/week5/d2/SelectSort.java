package com.example.javaproject2.week5.d2;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {

        int[] arr = {7,2,3,9,28,11,1,4};
        int target, targetIdx, tmp;

        for (int j = 0; j < arr.length ; j++) {
            target = arr[j];
            targetIdx = j;
            for (int i = 1+j; i < arr.length ; i++) {
                if(target > arr[i]) {
                    target = arr[i];
                    targetIdx = i;
                }
            }
            tmp = arr[j];
            arr[j] = target;
            arr[targetIdx] = tmp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
