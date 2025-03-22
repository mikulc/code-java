package com.pudding.polymorphic.polydetail;

/**
 * 多态的相关细节
 * 1.向上转型和向下转型
 *
 * @since 2025-03-22
 */
public class PolyDetail {
    public static void main(String[] args) {
        // 向上转型，animal可以调用父类的方法，但是无法调用子类的独有方法
        // 原因是在编译的时候已经确定了Anima中的所以方法，没有子类的特有方法，所以在执行的时候无法调用
        Animal animal = new Cat();
        animal.eat();
        animal.sleep();

        // 向下转型
        // 如果我们希望能够去访问子类的特有方法，那么我们可以使用向下转型
        // 原先在上面animal是指向Cat对象，下面是将cat指向Cat对象
        Cat cat = (Cat) animal;
        cat.catchMouse();

        // 错误例子：
        // Dog dog = (Dog) animal;
        // 因为animal原先指向的是Cat,现将animal强行转换成Dog,也就是将dog指向了Cat对象,这两者是没有任何关系的
        // 所以必须要求父类的引用必须指向当前目标类型的对象
    }
}
