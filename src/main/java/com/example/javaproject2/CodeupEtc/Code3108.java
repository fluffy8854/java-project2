package com.example.javaproject2.CodeupEtc;

import java.util.*;

public class Code3108 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<AttendeesList> al = new ArrayList<>();
        AttendeesList atl = new AttendeesList();


        atl.addAStudent(sc,al);
        Collections.sort(al);
        atl.printAStudent(sc,al);
    }
}

class AttendeesList implements Comparable<AttendeesList>{
    public String getC() {
        return c;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    String c;
    int code;
    String name;

    public AttendeesList(){

    }
    public AttendeesList(String c, int code, String name){
        this.c = c;
        this.code = code;
        this.name = name;
    }

    @Override
    public int compareTo(AttendeesList o) {
        if( this.code > o.code){
            return 1;
        }
        else if( this.code < o.code){
            return -1;
        }
        else return 0;
    }

    public boolean isDuplicate(int code, List<AttendeesList> al){
        boolean dupCode = false;
        for (int j = 0; j < al.size() ; j++) {
            if(al.get(j).getCode() == code){
                dupCode = true;
            }
        }
        return dupCode;
    }

    public List<AttendeesList> addAStudent(Scanner sc, List<AttendeesList> al){
        int n = sc.nextInt();
        boolean dupCode = false;
        String c ,name;
        int code;

        // 입력 처리
        for (int i = 0; i < n ; i++) {
            c = sc.next(); code = sc.nextInt(); name = sc.next();

            if(c.equals("I")){
                if(!isDuplicate(code,al)){
                    al.add(new AttendeesList(c, code, name));
                }
            }
            else if(c.equals("D")){
                for (int j = 0; j < al.size() ; j++) {
                    if(al.get(j).getCode() == code ){
                        al.remove(j);
                    }
                }
            }
        }
        return al;
    }

    public void printAStudent(Scanner sc, List<AttendeesList> al){
        int index;
        for (int i = 0; i < 5 ; i++) {
            index = sc.nextInt();
            System.out.printf("%d %s\n",al.get(index-1).getCode(),al.get(index-1).getName());
        }
    }
}
