package com.example.javaproject2.week5.d1;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {

    Comparator<Integer> comparator;

    public ComparatorEx(Comparator<Integer> comparator){
        this.comparator =comparator;
    }

    public void sort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length -1 -i ; j++) {
                if(this.comparator.compare(arr[j], arr[j+1]) > 0){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {

        ComparatorEx ce = new ComparatorEx(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        int[] arr = {7,2,3,9,28,11};
        ce.sort(arr);
        System.out.println(Arrays.toString(arr));

    }



}
