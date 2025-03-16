package com.exercise20240503;

public class Demo4 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Jay", 19);
    }
}

class Person {
    String name;
    int age;

    //定义一个无形参的构造器，age为18
    public Person() {
        age = 18;
        System.out.println(age + " " + name);  //name没有赋值，为null
    }

    //定义有两个形参的构造器
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
    }
}