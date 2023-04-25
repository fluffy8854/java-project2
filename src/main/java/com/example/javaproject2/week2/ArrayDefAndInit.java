package com.example.javaproject2.week2;

import java.util.Arrays;

public class ArrayDefAndInit {
    public static void main(String[] args) {
        // 배열 선언 방법
        int [] arr1 = new int[5];
        int [] arr2 = new int[]{1,2,3,4,5};
        String[] arr3 = new String[5];
        // 배열 초기화
        arr1[0] = 5;
        arr1[1] = 4;
        arr1[2] = 3;

        // 배열 출력
        System.out.printf("%s\n", Arrays.toString(arr1));
        System.out.printf("%s\n",Arrays.toString(arr2));
        System.out.printf("%s",Arrays.toString(arr3));
    }
}
