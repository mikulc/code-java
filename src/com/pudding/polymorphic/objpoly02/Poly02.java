package com.pudding.polymorphic.objpoly02;

/**
 * 主人喂食物体现的多态案例
 *
 * @since 2025-03-20
 */
public class Poly02 {
    public static void main(String[] args) {
        // 主人给小猫喂鱼
        Cat cat = new Cat("小喵");
        Fish fish = new Fish("秋刀鱼");
        Master tom = new Master("Tom");
        tom.feed(cat, fish);
        System.out.println("====================================");

        // 主人给小狗喂骨头
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("大排骨");
        tom.feed(dog, bone);
    }
}
