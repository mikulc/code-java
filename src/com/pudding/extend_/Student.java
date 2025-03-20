package com.pudding.extend_;

// 学生的父类
public class Student {
    // 共有的属性
    String name;
    int age;
    private int score;

    // 设置Setter方法
    public void setScore(int score) {
        this.score = score;
    }

    // 设置Getter方法
    public int getScore() {
        return this.score;
    }

    // 共有的方法
    public void getRes() {
        System.out.println("考试分数为 " + this.score);
    }
}
