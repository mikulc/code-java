package com.exercise20240504;

public class Demo7 {
    public static void main(String[] args) {
        Dog dog = new Dog("Tom", "red", 3);
        dog.show();
    }
}

class Dog {
    String name;
    String color;
    int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void show() {
        System.out.println("这只狗的名字是:" + this.name);
        System.out.println("这只狗的年龄是:" + this.age);
        System.out.println("这只狗的颜色是:" + this.color);
    }
}