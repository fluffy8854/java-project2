package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code98 {
    private int h = 0;
    private int w = 0;
    private int n = 0;
    private Scanner sc;
    public Code98(Scanner sc){
        this.sc =sc;
        this.h = sc.nextInt();
        this.w = sc.nextInt();
        this.n = sc.nextInt();
    }

    public void printCode98(){
        int[][] arr = new int[this.h][this.w];

        int l,d,x,y;

        for(int i = 0 ; i < this.n ; i++){

            l = this.sc.nextInt(); // 길이
            d = this.sc.nextInt(); // horizon, vertical
            x = this.sc.nextInt(); // x
            y = this.sc.nextInt(); // y

            for(int j = 0 ; j < l ; j++){

                if(d == 0){ // 가로
                    arr[x-1][y+j-1] = 1;
                }
                else if( d == 1){  // 세로
                    arr[x+j-1][y-1] = 1;
                }

            }
        }

        for(int q = 0 ; q < this.h ; q++){
            for(int k = 0 ; k < this.w ; k++){
                System.out.printf("%d ",arr[q][k]);
            }
            System.out.print("\n");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Code98 cd = new Code98(sc); //높이 , 가로

        cd.printCode98();

    }
}
