package com.concepts;

public class Constructor {
    public static void main(String[] args) {
        Student s2 = new Student("Jay", 20);
        Student s1 = new Student(18);  //因为该类有构造器，所以在创建对象的时候要传参数进去
        Student s3 = new Student();          //此时调用了无参构造器
    }
}

class Student {
    String name;
    int age;
    char sex;

    //构造器
    public Student(String sNmae, int sAge) {
        System.out.println("被执行~");
        name = sNmae;
        age = sAge;
    }

    //构造器的重载
    public Student(int sAge) {
        System.out.println("喵~");
        age = sAge;
    }

    //this访问构造器的演示
    public Student() {
        this('男');              //必须放在第一条
    }

    public Student(char sex) {
        System.out.println("性别为" + sex);
    }
}
