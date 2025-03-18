package com.exercise;

import java.util.Scanner;

/**
 * 水仙花数练习
 * 判断一个数是否是水仙花数
 *
 * @since 2024-04-17
 */
public class Daffodil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个三位数：");
        int num = sc.nextInt();

        int a = num / 100;       //得到百位
        int b = num % 100 / 10;   //得到十位
        int c = num % 10;        //得到个位

        if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == num) {
            System.out.println("是水仙花数！");
        } else {
            System.out.println("不是水仙花数！");
        }
    }
}
