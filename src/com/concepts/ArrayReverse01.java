package com.concepts;

public class ArrayReverse01 {
    public static void main(String[] args) {
        //数组的反转
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[array1.length];   //创建新的数组

        /*
         *for (int i = 0; i < array1.length; i++) {
         *   array2[array1.length - 1 - i] = array1[i];
         *}
         */

        //或者
        for (int i = array1.length - 1, j = 0; i >= 0; i--, j++) {
            array2[j] = array1[i];
        }

        //将array1指向array2的数据空间
        array1 = array2;

        //此时array1原有的数据没有被变量引用，将会被当作垃圾被回收掉

        //遍历数组
        for (int j = 0; j < array2.length; j++) {
            System.out.println(array1[j]);
        }
    }
}
