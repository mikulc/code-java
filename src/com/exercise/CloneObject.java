package com.exercise;

/**
 * 克隆对象
 *
 * @since 2024-05-02
 */
public class CloneObject {
    public static void main(String[] args) {
        Person1 p = new Person1();
        p.name = "Jay";
        p.age = 18;
        //创建一个对象
        MyTools1 myTools1 = new MyTools1();
        Person1 p2 = myTools1.copyPerson(p);
        //此时p和p2都是独立的对象
    }
}

class Person {
    String name;
    int age;
}

class MyTools1 {
    public Person1 copyPerson(Person1 p) {
        Person1 p2 = new Person1();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }
}