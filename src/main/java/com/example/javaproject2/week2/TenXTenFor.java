package com.example.javaproject2.week2;

import java.util.Arrays;

public class TenXTenFor {
    public static void main(String[] args) {
        int[][] arr10x10 = new int[10][10];

        for(int i = 0 ; i < 10 ; i++ ){
            System.out.println(Arrays.toString(arr10x10[i]));
        }
    }
}