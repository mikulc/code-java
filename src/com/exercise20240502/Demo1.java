package com.exercise20240502;

public class Demo1 {
    public static void main(String[] args) {
        //定义一个类,可以遍历二维数组
        MyTools myTools = new MyTools();
        int arr[][] = {{2, 3, 4}, {3, 4, 5, 6}};
        myTools.printArr(arr);
    }
}

class MyTools {
    public void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}