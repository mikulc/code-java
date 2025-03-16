package com.concepts;

public class MethodParameter01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        AA a1 = new AA();
        a1.swap(a, b);
        System.out.println(a + " " + b);

        //因为都是基本数据类型，数据直接存储在栈中，两个方法在栈中作用域不一样，互不影响
        //基本数据类型，传递的是值，形参的任何改变不影响实参
    }
}

class AA {
    public void swap(int a, int b) {
        //对a和b进行交换
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}