package com.pudding.polymorphic.polyarr;

// Student子类
public class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        return super.say() + ", score: " + this.score;
    }

    // 学生特有的方法
    public void study() {
        System.out.println("学生:" + getName() + "正在学习...");
    }
}
