package com.pudding.polymorphic.objpoly01;

/**
 * 多态的体现（对象的多态体现）
 *
 * @since 2025-03-20
 */
public class PolyObject {
    public static void main(String[] args) {
        // Animal为编译类型，Dog为运行类型。编译类型在一开始就确定，不能更改，但是运行类型可以更改。
        Animal animal = new Dog();
        // Animal和Dog中都有cry()方法，具体执行哪一个看的是运行类型
        animal.cry();

        // 更改运行类型为Cat
        animal = new Cat();
        animal.cry();
    }
}
