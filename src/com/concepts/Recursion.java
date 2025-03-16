package com.concepts;

public class Recursion {
    public static void main(String[] args) {
        T t = new T();
        t.test(4);
        int res = t.factorial(4);
        System.out.println("res=" + res);
    }
}

class T {
    //递归测试
    public void test(int a) {
        if (a > 2) {
            test(a - 1);
        }
        System.out.println(a);
    }
    //阶乘
    public int factorial(int b) {
        if (b == 1) {
            return b;
        }else {
            return factorial(b - 1) * b;
        }
    }
}