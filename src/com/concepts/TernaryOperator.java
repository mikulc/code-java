package com.concepts;

public class TernaryOperator {
    public static void main(String[] args) {
        //使用三元运算符实现三个数中的最大值
        int a = 1;
        int b = 2;
        int c = 3;
        int max1 = a > b ? a : b;
        int max2 = max1 > c ? max1 : c;

        System.out.println("abc三个数中最大的是：" + max2);
    }
}
