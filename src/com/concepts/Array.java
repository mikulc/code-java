package com.concepts;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //创建一个大小为5的数组
        double[] score = new double[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < score.length; i++) {
            System.out.print("请输入第" + (i + 1) + "元素的值：");
            score[i] = sc.nextDouble();
        }

        for (double i : score) {
            System.out.println(i);
        }


    }
}
