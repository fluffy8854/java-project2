package com.example.javaproject2.week4;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ReadFile {
    public static void main(String[] args) throws IOException {
        ReadFile rf = new ReadFile();
        String fileName = "hospital_info_10lines.csv"; //"C:\\Users\\LJR\\Documents\\3.의료기관별상세정보서비스_01_시설정보_2022.10.UTF8.csv";
        List<String> sl = rf.getLines(fileName);
        List<Hospital> hl = rf.getHospitals(sl);
        for (int i = 1; i < 10 ; i++) {
            System.out.printf("주소 : %s 이름 : %s 홈페이지 : %s\n",hl.get(i).getAddress().getFullAddr(),hl.get(i).getName(),hl.get(i).getPhonNumber());
        }

    }

    public Hospital parse(String str){

        String[] splited = str.split(",");

        Address address = new Address(splited[12],splited[5],splited[7]);
        Hospital hospital = new Hospital(address,splited[1],splited[11]);

        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines){
        List<Hospital> hospitals = new ArrayList<>();
        for( String line : lines){
            hospitals.add(parse(line));
        }
        return hospitals;
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
