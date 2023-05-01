package com.example.javaproject2.week3;

public class MultiplicationTabel3 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 8, 9};
        for( int i = 0 ; i < 4 ; i++){
            for(int j = 1 ; j <=9 ; j++) {
                System.out.printf("%d * %d = %d\n", arr[i], j, j*arr[i]);
            }
        }
    }
}
