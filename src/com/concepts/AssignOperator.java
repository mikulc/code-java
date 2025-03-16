package com.concepts;

public class AssignOperator {
    public static void main(String[] args) {
        //复合赋值运算符会进行类型转换

        int a = 1;
        a += 1;  //等价于 a = (byte)(a + 1),但如果是a  = a + 1则（a + 1）的结果为int类型

        a++; //同理a++ = (byte)(a + 1),而写成a = a + 1 会报错
    }
}
