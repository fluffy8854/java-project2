package com.example.javaproject2.week4;

public class Hospital {
    private Address address;
    private String name;
    private String phonNumber;

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getPhonNumber() {
        return phonNumber;
    }

    public Hospital(Address address, String name, String phonNumber) {
        this.address = address;
        this.name = name;
        this.phonNumber = phonNumber;
    }
}
