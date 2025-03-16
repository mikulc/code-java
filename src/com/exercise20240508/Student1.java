package com.exercise20240508;

public class Student1 extends Person{
    private int id;
    private double score;

    public Student1(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say() {
        return "hello";
    }
}
