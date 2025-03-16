package com.concepts;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {21, 45, 56, 32};

        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {  //前面的数大就交换，反之降序就改为小于号
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("排序后的结果是：");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
