package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row, cmn;
        int[][] arr = new int [19][19];
        for( int i = 0 ; i < n ; i ++){
            row = sc.nextInt();
            cmn = sc.nextInt();

            arr[row-1][cmn-1] = 1;
        }

        for(int j = 0 ; j < 19 ; j++){
            for(int k = 0 ; k < 19 ; k++){
                System.out.printf("%d ",arr[j][k]);
            }
            System.out.print("\n");
        }
    }
}
