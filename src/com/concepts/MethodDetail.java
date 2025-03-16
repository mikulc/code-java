package com.concepts;

public class MethodDetail {
    public static void main(String[] args) {
        //在A中调用B的方法
        A a = new A();
        a.say();
    }
}

class A {
    public void say() {
        System.out.println("say");
        B b = new B();
        b.hello();
    }
}

class B {
    public void hello() {
        System.out.println("hello");
    }
}