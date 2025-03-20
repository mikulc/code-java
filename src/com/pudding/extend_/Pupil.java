package com.pudding.extend_;

public class Pupil extends Student {
    // 继承了父类的name属性
    public void getStatus() {
        System.out.println("小学生 " + name + " 正在考试......");
    }
}
