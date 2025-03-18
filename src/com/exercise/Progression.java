package com.exercise;

/**
 * 等差数列的和以及前n个自然数的和和平方和
 * 求（0+1）+（1+2）+（1+2+3）+...+（1+..+100）的结果
 *
 * @since 2024-04-17
 */
public class Progression {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 0; j <= i; j++) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
