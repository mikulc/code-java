package com.pudding.override;

public class Dog extends Animal {
    @Override
    public void cry() {
        System.out.println("Dog类的cry方法");
    }

    @Override
    //此时虽然返回的类型不相同，但是String是Object的子类，所以也构成重写
    //如果父类为String，子类为Object，则会直接报错
    public String cry01() {
        return null;
    }
}
