package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row, cmn;
        int[][] arr = new int [19][19];

        for( int inX =0 ; inX < 19 ; inX++){
            for(int inY = 0 ; inY < 19 ; inY++){
                arr[inX][inY] = sc.nextInt();
            }
        }



        int n = sc.nextInt();

        for( int i = 0 ; i < n ; i ++){
            row = sc.nextInt();
            cmn = sc.nextInt();

            for( int x = 0 ; x < 19 ; x++){
                if(arr[row-1][x] == 1) arr[row-1][x] = 0;
                else arr[row-1][x] = 1;
            }
            for( int y = 0 ; y < 19 ; y++){
                if(arr[y][cmn-1] == 1) arr[y][cmn-1] = 0;
                else arr[y][cmn-1] = 1;
            }
        }

        for(int j = 0 ; j < 19 ; j++){
            for(int k = 0 ; k < 19 ; k++){
                System.out.printf("%d ",arr[j][k]);
            }
            System.out.print("\n");
        }
    }
}
