package com.demo;

public class Demo {
    public static void main(String[] args) {
        A a = new A("Jay", 120);
        System.out.println(a.getAge());
    }
}

class A {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 20) {
            this.age = age;
        }
    }

    private String name;
    private int age;

    public A(String name, int age) {
        setAge(age);
        this.name = name;
    }


}