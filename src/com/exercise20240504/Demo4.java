package com.exercise20240504;

public class Demo4 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 21, 32};
        A03 a03 = new A03();
        int[] arrNew = a03.copyArr(arr);
        System.out.print("新的数组是：");
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i] + ",");
        }
    }
}

class A03 {
    public int[] copyArr(int[] arr) {
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < arrNew.length; i++) {
            arrNew[i] = arr[i];
        }
        return arrNew;
    }
}