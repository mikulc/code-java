package com.exercise;

/**
 * 比较两人的名字和年龄，如果都一样返回true
 *
 * @since 2025-05-03
 */
public class CompareTo {
    public static void main(String[] args) {
        //
        Person2 p1 = new Person2("Jay", 18);
        Person2 p2 = new Person2("Jay", 19);
        System.out.println(p1.compareTo(p2));
    }
}

class Person2 {
    String name;
    int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Person2 p) {
        return this.name.equals(p.name) && this.age == p.age;
    }
}


