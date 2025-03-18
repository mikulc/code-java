package com.exercise;

/**
 * 构造器练习
 *
 * @since 2025-05-03
 */
public class Constructor {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        Person1 p2 = new Person1("Jay", 19);
    }
}

class Person1 {
    String name;
    int age;

    //定义一个无形参的构造器，age为18
    public Person1() {
        age = 18;
        System.out.println(age + " " + name);  //name没有赋值，为null
    }

    //定义有两个形参的构造器
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
    }
}