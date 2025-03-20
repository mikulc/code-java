package com.pudding.polymorphic;

/**
 * 多态的体现（方法的多态体现）
 *
 * @since 2025-03-20
 */
public class Polymorphic01 {
    public static void main(String[] args) {
        // 重写体现的多态
        A a = new A();
        B b = new B();
        a.say();
        b.say();

        // 重载体现的多态
        b.sum(1, 2);
        b.sum(1, 2, 3);
    }
}

class A {
    public void say() {
        System.out.println("A的say方法被调用");
    }
}

class B extends A {
    @Override
    public void say() {
        System.out.println("B的say方法被调用");
    }

    // sum方法重载
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}