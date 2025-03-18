package com.exercise;

/**
 * 方法的练习
 *
 * @since 2024-04-25
 */
public class MethodPractice {
    public static void main(String[] args) {
        A a = new A();
        Boolean res = a.isOdd(2);
        System.out.println(res);
    }
}

//判断一个数是否是奇数
class A {
    public boolean isOdd(int a) {
        return a % 2 != 0;
    }
}
