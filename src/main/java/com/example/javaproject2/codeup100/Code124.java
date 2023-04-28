package com.example.javaproject2.codeup100;

import java.util.Scanner;

public class Code124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String at = sc.next();
        String[] arr = at.split("H");
        arr[0] = arr[0].substring(1, arr[0].length());
        int carbon = Integer.parseInt(arr[0]);
        int hyd = Integer.parseInt(arr[1]);

        System.out.printf("%d",12*carbon + hyd);
    }
}
