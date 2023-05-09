package com.example.javaproject2.week3;

public class MultiplicationTabel {
    private char sign = '*';

    MultiplicationTabel(char c){
        this.sign = c;
    }
    public static void main(String[] args) {
        MultiplicationTabel mt = new MultiplicationTabel('x');
        MultiplicationTabel mt2 = new MultiplicationTabel('*');
        mt.printMultipleication(2);
        mt.printMultipleication(3);
        mt2.printMultipleication(5);
        mt2.printMultipleication(7);
    }

    public void printMultipleication(int dan){

        for( int i = 1; i <= 9 ; i++){
            System.out.printf("%d %c %d = %d\n", dan, this.sign, i, dan*i);
        }
        System.out.println("-------------------");
    }
}
