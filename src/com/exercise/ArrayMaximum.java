package com.exercise;

/**
 * 求出一个数组中的最大值,并且返回下标值
 *
 * @since 2024-04-18
 */
public class ArrayMaximum {
    public static void main(String[] args) {
        int[] num = {98, 45, 54, 3, 32, 78, 99};

        int max = num[0];
        int indexNum = 0;

        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                indexNum = i;
            }
        }
        System.out.println("最大的数是：" + max + "\n" + "其下标值是：" + indexNum);
    }
}
