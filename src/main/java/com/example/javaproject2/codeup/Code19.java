package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Code19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String Tokenizer --> split
        String[] sArr = sc.next().split("\\."); // . String으로 표현 ->> 정규표현식 [.] or \\. 으로 표현 why .은 정규 표현식에서 스페셜문자로 any Character를 의미함.
        // 문자열 Int형으로 변환 --> Integer.parseInt()
        System.out.printf("%04d.%02d.%02d",Integer.parseInt(sArr[0]),Integer.parseInt(sArr[1]),
                Integer.parseInt(sArr[2]));

    }
}
