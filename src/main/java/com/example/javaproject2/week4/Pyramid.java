package com.example.javaproject2.week4;

import java.util.Scanner;

public class Pyramid {
    public String spacechar = "0";
    public Pyramid(String sc){
        this.spacechar = sc;
    }

    public void printPyramid(int height){

        for (int i = 0; i < height ; i++) {

            for (int j = height - i; j > 0 ; j--) {
                System.out.print(spacechar);
            }

            for (int j = 0; j < 2*i +1 ; j++) {
                System.out.print("*");
            }

            System.out.println("");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Pyramid p = new Pyramid(" ");
        p.printPyramid(num);
    }
}