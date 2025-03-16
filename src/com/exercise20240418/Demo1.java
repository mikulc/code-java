package com.exercise20240418;

public class Demo1 {
    public static void main(String[] args) {
        //求出一个数组中的最大值,并且返回下标值
        int[] num = {98, 45, 54, 3, 32, 78, 99};

        int max = num[0];
        int indexNum = 0;

        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                indexNum = i;
            }
        }
        System.out.println("最大的数是：" + max + "\n" +"其下标值是：" + indexNum);
    }
}
