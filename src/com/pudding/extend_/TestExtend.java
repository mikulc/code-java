package com.pudding.extend_;

/**
 * 继承的练习代码
 * 同时结合了封装概念
 *
 * @since 2025-03-19
 */
public class TestExtend {
    public static void main(String[] args) {
        // 实例化对象
        Pupil pupil = new Pupil();
        // 设置公有属性值
        pupil.name = "Jay";
        // 设置私有属性值
        pupil.setScore(100);
        // 调用方法
        pupil.getStatus();
        pupil.getRes();
    }
}
