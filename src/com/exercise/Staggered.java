package com.exercise;

/**
 * 交错调和级数的前100项和
 * 计算（1/1）-（1/2）+...+(1/100)的结果
 *
 * @since 2024-04-17
 */
public class Staggered {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum -= 1.0 / i;
            } else {
                sum += 1.0 / i;
            }
        }
        System.out.println("结果是：" + sum);
    }
}
