package com.example.javaproject2.codeup50;

import java.util.Scanner;

public class Code94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int check;
        int[] arr = new int[num];
        for(int i = 0 ; i < num ; i++){
            check = sc.nextInt();
            arr[num-1-i] = check;
        }

        for(int j : arr){
            System.out.printf("%d ",j);
        }
    }
}
