package com.pudding;

/**
 * 数组练习
 *
 * @since 2025-03-18
 */
public class ArrayTest {
    public static void main(String[] args) {
        // 静态初始化
        int[] arr = {1, 2, 3, 4};
        // 动态初始化(数组长度为5，并且有初始值0)
        int[] arr1 = new int[5];

        // 数组的遍历
        // 普通for循环
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("=============================");
        // 增强的for循环
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
