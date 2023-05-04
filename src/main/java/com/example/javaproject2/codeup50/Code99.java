package com.example.javaproject2.codeup50;

import java.io.*;


public class Code99 {
    public static void main(String[] args) throws IOException {
        int [][] arr = new int[10][10];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean b = true;
        int x = 1, y = 1;
        int d = 1, l = 1;
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10 ; j++) {
                arr[i][j] = br.read() - 48;
                br.skip(1);
                if( arr[i][j] == 2){
                    x = i;
                    y = j;
                }
            }
        }
        if(arr[1][1] == 2){
            b = false;
        }
        arr[1][1] = 9;

        for(int p = 0 ; p < 14; p++){
            if (!b) break;
            if(arr[d][l+1] == 0){
                arr[d][++l] = 9;
            }
            else if(arr[d][l+1] == 1){
                if(arr[d+1][l] == 0 ) arr[++d][l] = 9;
                else if(arr[d+1][l] == 1) break;
                else if(arr[d+1][l] == 2){
                    arr[++d][l] = 9;
                    break;
                }
            }
            else if(arr[d][l+1] == 2){
                arr[d][++l] = 9;
                break;
            }
        }

        for(int q = 0 ; q < 10 ; q++){
            for(int k = 0 ; k < 10 ; k++){
                bw.write(String.valueOf(arr[q][k]));
                bw.write(" ");
            }
            bw.newLine();
        }
        bw.flush();

    }
}
