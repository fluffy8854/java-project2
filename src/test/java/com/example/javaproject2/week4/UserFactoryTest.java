package com.example.javaproject2.week4;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {
    public static void main(String[] args) {
        UserFactory uf =new UserFactory();
        User user1= uf.getAdultUser();
        System.out.println(user1.getAge());
    }

}