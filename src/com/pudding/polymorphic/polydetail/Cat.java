package com.pudding.polymorphic.polydetail;

public class Cat extends Animal {
    // 重写父类的eat方法
    @Override
    public void eat() {
        System.out.println("cat eat");
    }

    // 子类独有的方法
    public void catchMouse() {
        System.out.println("Catch mouse");
    }
}
