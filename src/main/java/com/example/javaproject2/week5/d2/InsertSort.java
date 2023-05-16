package com.example.javaproject2.week5.d2;

import java.util.Arrays;
import java.util.Comparator;

public class InsertSort {
    private Comparator<Integer> comparator;

    public InsertSort(Comparator<Integer> cmp){
        this.comparator = cmp;
    }

    public static void main(String[] args) {
        int[] arr = {7,2,3,9,28,11,1,4,7};
        InsertSort is = new InsertSort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        is.iSort(arr);

        System.out.println(Arrays.toString(arr));
    }
    public void iSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >= 1; j--) {
                iSortARound(arr,j);
            }
        }
    }
    public void iSortARound(int[]arr, int j){
        if(comparator.compare(arr[j-1],arr[j])>0){
            int tmp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = tmp;
        }
    }

}
