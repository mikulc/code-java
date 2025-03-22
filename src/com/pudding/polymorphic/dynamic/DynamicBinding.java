package com.pudding.polymorphic.dynamic;

/**
 * 动态绑定机制
 * 1.当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
 * 2.属性没有动态绑定机制，哪里声明哪里使用
 *
 * @since 2025-03-22
 */
public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}

class A {
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A {
    public int i = 20;

    public int sum() {
        return i + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}