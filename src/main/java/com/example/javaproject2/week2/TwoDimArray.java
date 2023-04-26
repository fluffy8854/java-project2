package com.example.javaproject2.week2;

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int[] arr2 = arr[0];         // arr2 의 주소는 = arr[0]의 주소
        arr2[0] = 1;

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

    }
}
