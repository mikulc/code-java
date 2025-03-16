package com.exercise20240423;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        //生成随机数，保存到数组arr
        for (int i = 0; i < 10; i++) {
            int num = (int)(Math.random() * 100) + 1;
            arr[i] = num;
        }
        //倒序打印
        System.out.print("倒序前：");
        for (int i = 0;i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("倒序后：");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        //求平均值
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println();
        System.out.print("平均值为：" + (sum / arr.length));

        //求最大值的下标
        int maxNum = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
                maxIndex = i;
            }
        }
        System.out.println();
        System.out.print("最大值为：" +  maxNum + "下标为：" + maxIndex);
        System.out.println();

        //查找数组中是否有8
        int findNum = 8;
        int fidnIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findNum) {
                System.out.println("找到8了，下标为：" + i);
                fidnIndex = i;
                break;
            }
        }
        if (fidnIndex == -1) {
            System.out.println("没有找到8！");
        }
    }
}
