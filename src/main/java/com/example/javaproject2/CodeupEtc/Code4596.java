package com.example.javaproject2.CodeupEtc;

import java.util.Scanner;

public class Code4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int [9][9];
        int max = Integer.MIN_VALUE;
        int x= -1,y =-1;

        for( int inX =0 ; inX < 9 ; inX++){
            for(int inY = 0 ; inY < 9 ; inY++){
                arr[inX][inY] = sc.nextInt();
            }
        }

        for(int j = 0 ; j < 9 ; j++){
            for(int k = 0 ; k < 9 ; k++){
                if(arr[j][k] > max) {
                    max = arr[j][k];
                    x = j +1;
                    y = k +1;
                }

            }
        }
        System.out.printf("%d\n%d %d",max,x,y);
    }
}
