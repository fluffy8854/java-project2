package com.example.javaproject2.week2;

import java.util.Arrays;

public class FillArray {
    public static void rowFill(int[][] arr){

    }
    public static void main(String[] args) {
        int[][] arrRow = new int[5][5];
        int[][] arrCmn = new int[5][5];

        arrRow[2][0]= 1;
        arrRow[2][1]= 1;
        arrRow[2][2]= 1;
        arrRow[2][3]= 1;
        arrRow[2][4]= 1;

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
