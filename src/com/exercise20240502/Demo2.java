package com.exercise20240502;

public class Demo2 {
    public static void main(String[] args) {
        //克隆对象
        Person p = new Person();
        p.name = "Jay";
        p.age = 18;
        //创建一个对象
        MyTools1 myTools1 = new MyTools1();
        Person p2 = myTools1.copyPerson(p);
        //此时p和p2都是独立的对象
    }
}

class Person {
    String name;
    int age;
}

class MyTools1 {
    public Person copyPerson(Person p) {
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }
}