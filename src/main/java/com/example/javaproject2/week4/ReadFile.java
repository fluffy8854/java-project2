package com.example.javaproject2.week4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadFile {
    public static void main(String[] args) throws IOException {
        ReadFile rf = new ReadFile();
        String fileName = "hospital_info_10lines.csv"; //"C:\\Users\\LJR\\Documents\\3.의료기관별상세정보서비스_01_시설정보_2022.10.UTF8.csv";
        List<String> sl = rf.getLines(fileName);
        for (int i = 1; i < 10 ; i++) {
            System.out.println(sl.get(i));
        }

    }

    public List<String> getLines(String fName){
        List<String> sl = new ArrayList<>();

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fName),"UTF8"));
            String line;
            while((line = br.readLine()) != null){
                sl.add(line);

            }
        }catch(IOException e){
            throw new RuntimeException(e);
        }

        return sl;
    }
}
