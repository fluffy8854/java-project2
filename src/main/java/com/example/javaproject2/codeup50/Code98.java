package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code98 {
    private int h = 0;
    private int w = 0;
    public Code98(int h, int w){
        this.h = h;
        this.w = w;
    }

    public void printCode98(int n, Scanner sc){
        int[][] arr = new int[this.h][this.w];

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Code98 cd = new Code98(sc.nextInt(),sc.nextInt()); //높이 , 가로

        cd.printCode98(sc.nextInt(),sc);

    }
}
