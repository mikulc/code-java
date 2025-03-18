package com.pudding;

/**
 * this关键字的练习
 * 判断两个对象的名字和年龄是否相等
 *
 * @since 2025-03-18
 */

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("jay", 12);
        Person p2 = new Person("jay", 13);

        System.out.println(p1.compareTo(p2));
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Person p) {
        // 比较字符串使用equals
        return this.name.equals(p.name) && this.age == p.age;
    }
}
