package com.example.javaproject2.week4;

import java.util.Scanner;

public class Diamond {

    public String makeALine(int h, int i){
        String str = "";
        if(i <= h/2 -1){
            for(int j = (h - 1) / 2 - i ; j > 0 ; j--) str += " ";
            for (int j = 0; j < 2 * i + 1; j++) str += "*";
        }
        else{
            for (int j = 0; j < i - h / 2; j++) str += " ";
            for (int j = 2 * h - 2 * i - 1; j > 0; j--) str += "*";
        }

        return str;
    }

    public void printDiamond(int h) {
        for (int i = 0; i < h; i++) {

            if (i <= h / 2 - 1) {
                for (int j = (h - 1) / 2 - i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
            } else if (i > h / 2 - 1) {
                for (int j = 0; j < i - h / 2; j++) {
                    System.out.print(" ");
                }

                for (int j = 2 * h - 2 * i - 1; j > 0; j--) {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Diamond dm = new Diamond();
        dm.printDiamond(sc.nextInt());
        System.out.println(dm.makeALine(7,0));


    }
}

