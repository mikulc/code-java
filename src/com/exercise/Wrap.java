package com.exercise;

/**
 * 包装类练习
 * 定义一个类，可以比较数组的大小
 *
 * @since 2024-05-04
 */
public class Wrap {
    public static void main(String[] args) {
        double[] arr = {2.1, 2.3, 4.5, 21.0};
        //double[] arr = null;

        A01 a01 = new A01();
        Double res = a01.max(arr);
        if (res != null) {
            System.out.println(res);
        } else {
            System.out.println("你输入的arr有误！");
        }
    }
}

class A01 {
    //包装类
    public Double max(double[] arr) {
        if (arr.length > 0 && arr != null) {
            double maxNum = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > maxNum) {
                    maxNum = arr[i];
                }
            }
            return maxNum;
        } else {
            return null;
        }
    }
}