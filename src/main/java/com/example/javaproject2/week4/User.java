package com.example.javaproject2.week4;

public class User {
    String name;
    String phoneNumber;
    int age;

    boolean isAdult(){
        return this.age >= 18;
    }
}
