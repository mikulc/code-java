package com.concepts;

public class ArrayAdd01 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        //1.先创建一个比原数组大的一个新数组
        int[] arrNew = new int[arr1.length + 1];

        //2.将原数组依次遍历到新数组
        for (int i = 0; i < arr1.length; i++) {
            arrNew[i] = arr1[i];
        }

        arrNew[arrNew.length - 1] = 5;  //赋值
        arr1 = arrNew;  //将arr1指向arrNew

        //遍历arr1数组
        for (int j = 0; j < arr1.length; j++) {
            System.out.println(arr1[j]);
        }
    }
}
