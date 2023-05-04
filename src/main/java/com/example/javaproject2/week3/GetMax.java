package com.example.javaproject2.week3;

public class GetMax {
    public static void main(String[] args) {
        int[] arr = {2, 1, 31, 9, 7 };

        int tVal = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i] > tVal) tVal = arr[i];
        }
        System.out.println(tVal);
    }
}
