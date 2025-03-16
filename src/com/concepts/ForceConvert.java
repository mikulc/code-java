package com.concepts;

public class ForceConvert {
    public static void main(String[] args) {
        int a = (int)1.9;
        System.out.println(a); //精度丢失

        int b = 2000;
        byte c = (byte)b;
        System.out.println(c); //数据溢出
    }
}
