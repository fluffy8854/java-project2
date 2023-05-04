package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); // 세로
        int w = sc.nextInt(); // 가로
        int [][] arr = new int[h][w];

        int n = sc.nextInt(); // 횟수

        int l,d,x,y;

        for(int i = 0 ; i < n ; i++){

            l = sc.nextInt(); // 길이
            d = sc.nextInt(); // horizon, vertical
            x = sc.nextInt(); // x
            y = sc.nextInt(); // y

            for(int j = 0 ; j < l ; j++){

                if(d == 0){ // 가로
                    arr[x-1][y+j-1] = 1;
                }
                else if( d == 1){  // 세로
                    arr[x+j-1][y-1] = 1;
                }

            }
        }

        for(int q = 0 ; q < h ; q++){
            for(int k = 0 ; k < w ; k++){
                System.out.printf("%d ",arr[q][k]);
            }
            System.out.print("\n");
        }


    }
}
