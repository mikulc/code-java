package com.pudding.override;

public class Animal {
    public void cry() {
        System.out.println("Animal类的cry方法");
    }

    // 当父类的某个方法返回的是Object
    public Object cry01() {
        return null;
    }
}
