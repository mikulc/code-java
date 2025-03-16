package com.exercise20240503;

public class Demo1 {
    public static void main(String[] args) {
        Methods methods = new Methods();

        System.out.println(methods.m("hello world"));
    }
}

class Methods {
    public int m(int n1) {
        return (int)Math.pow(n1, 2);
    }
    public int m(int n1, int n2) {
        return n1 * n2;
    }
    public String m(String str) {
        return str;
    }
}