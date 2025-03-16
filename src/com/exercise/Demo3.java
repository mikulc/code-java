package com.exercise;

public class Demo3 {
    public static void main(String[] args) {
        //定义一个数组，然后用for循环遍历26个字母并放进数组
        char[] letter = new char[26];

        for (int i = 0; i < letter.length; i++) {
            letter[i] =(char)('A' + i);
        }
        for (int i = 0; i < letter.length; i ++) {
            System.out.println(letter[i]);
        }
    }
}
