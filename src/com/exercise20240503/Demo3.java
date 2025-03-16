package com.exercise20240503;

public class Demo3 {
    public static void main(String[] args) {
        //实现返回姓名和总成绩
        Student student = new Student();
        System.out.println(student.score("Jay", 50, 50));
    }
}

class Student {
    public String score(String name, int... scores) {
        int sumScore = 0;
        for (int i = 0; i < scores.length; i++) {
            sumScore += scores[i];
        }
        //return 只能返回一个值，但我们可以把这些值拼接成字符串来返回
        return name + "的总成绩为：" + sumScore;
    }
}