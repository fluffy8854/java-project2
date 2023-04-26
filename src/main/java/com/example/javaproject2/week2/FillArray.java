package com.example.javaproject2.week2;

import java.util.Arrays;

public class FillArray {
    public static void rowFill(int[][] arr, int row){
        for(int i = 0 ; i < arr[row].length ; i++){
            arr[row][i] = 1;
        }
    }




    public static void main(String[] args) {
        int[][] arrRow = new int[5][5];
        int[][] arrCmn = new int[5][5];

        rowFill(arrRow,2);

        for(int i = 0 ; i < 5 ; i++){
            System.out.println(Arrays.toString(arrRow[i]));
        }
        System.out.println("----------");

        arrCmn[0][3] = 1;
        arrCmn[1][3] = 1;
        arrCmn[2][3] = 1;
        arrCmn[3][3] = 1;
        arrCmn[4][3] = 1;
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(Arrays.toString(arrCmn[i]));
        }
    }
}
