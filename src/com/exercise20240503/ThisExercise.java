package com.exercise20240503;

public class ThisExercise {
    public static void main(String[] args) {
        //比较两人的名字和年龄，如果都一样返回true
        Person1 p1 = new Person1("Jay", 18);
        Person1 p2 = new Person1("Jay", 19);
        System.out.println(p1.compareTo(p2));
    }
}

class Person1 {
    String name;
    int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(Person1 p) {
        return this.name.equals(p.name) && this.age == p.age;
    }
}


