package com.pudding.polymorphic.objpoly02;

// 定义动物子类Cat
public class Cat extends Animal {
    // 因为父类无参构造器已被覆盖，子类继承时必须要在子类构造器中指定父类构造器
    public Cat(String name) {
        super(name);
    }
}
