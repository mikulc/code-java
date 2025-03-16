package com.concepts;

public class CharDetail {
    public static void main(String[] args) {
        //1.在Java中，char的本质是整数，在输出时是unicode码对应的字符
        char num1 = 97;
        char num2 = 'a';
        //会输出ASCII码对应的字幕
        System.out.println(num1);
        //如果想反过来可以这样
        System.out.println((int)num2);
        //char是可以进行运算的
        System.out.println('a' + 10);
    }
}
