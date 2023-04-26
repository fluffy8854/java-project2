package com.example.javaproject2.week2;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].name = "임지양";
        students[0].phoneNumber = "010-1234-5678";
        students[0].age = 26;
        students[1].name = "아무개";
        students[1].phoneNumber = "010-9876-5432";
        students[1].age = 24;
    }
}


