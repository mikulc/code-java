package com.exercise20240502;

public class Demo3 {
    public static void main(String[] args) {
        /*递归求第n个斐波那契数 1，1，2，3，5，8，13...
          n = 1,         1
          n = 2,         1
          n = 3,         2
          n = 4,         3
         */
        T t = new T();
        int res = t.fib(10);
        System.out.println(res);
    }
}

class T {
    public int fib(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fib(n - 1) + fib(n - 2);
            }
        }else {
            System.out.println("输入的数不正确");
            return 0;
        }
    }
}