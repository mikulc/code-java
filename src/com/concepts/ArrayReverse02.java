package com.concepts;

public class ArrayReverse02 {
    public static void main(String[] args) {
        //对数组的反转（推荐）
        int[] arr1 = {1, 2, 3, 4};

        int len = arr1.length;
        int temp = 0;
        //进行两次交换
        for (int i = 0; i < len / 2; i++) {
            temp = arr1[len - 1 - i];
            arr1[len - 1 - i] = arr1[i];
            arr1[i] = temp;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
