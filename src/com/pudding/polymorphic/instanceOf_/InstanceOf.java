package com.pudding.polymorphic.instanceOf_;

/**
 * instanceof 用于判断  对象的运行类型  是否为xx类型 或者 xx类型的子类型
 *
 * @since 2025-03-22
 */
public class InstanceOf {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB); // bb的运行类型为BB,所以为true
        System.out.println(bb instanceof AA); // bb的运行类型为BB,而BB为AA的子类，所以为true

        Object o = new Object();
        // o的运行类型为Object,不属于AA的子类
        System.out.println(o instanceof AA);  // false
    }
}

// 父类
class AA {
}

// 子类
class BB extends AA {
}