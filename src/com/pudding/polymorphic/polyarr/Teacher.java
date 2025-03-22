package com.pudding.polymorphic.polyarr;

// Teacher子类
public class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + ", salary: " + salary;
    }

    // 老师特有的方法
    public void teach() {
        System.out.println("老师:" + getName() + "正在讲Java课程...");
    }
}
