package com.example.javaproject2.week3;

public class GetMin {
    public static void main(String[] args) {
        int[] arr = {-1, -3, -31, -9, -7 };

        int tVal = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i] > tVal) tVal = arr[i];
        }
        System.out.println(tVal);
    }

}
