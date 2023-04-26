package com.example.javaproject2.week2;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInShcool classInShcool = new ClassInShcool();
        classInShcool.students = new Student[30];
        classInShcool.teacher = new Teacher();
        classInShcool.no = 1;
        classInShcool.teacher.name = "xxx";
        classInShcool.teacher.age = 40;
        classInShcool.teacher.address = "경기도";

        System.out.println(classInShcool.teacher.name);
        System.out.printf("%d반 담임선생님 이름은 %s 입니다.", classInShcool.no,classInShcool.teacher.name);
    }
}
class ClassInShcool{
    int no;
    Teacher teacher;
    Student[] students;
}

class Teacher{
    String name;
    int age;
    String address;
}
