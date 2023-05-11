package com.example.javaproject2.week4;

import java.util.ArrayList;
import java.util.List;

public class ListUser {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User user1 = new User("김미미", "01012345678" , 26);
        users.add(user1);
        User user2 = new User("김나나", "01012345679" , 25);
        users.add(user2);


    }
}
